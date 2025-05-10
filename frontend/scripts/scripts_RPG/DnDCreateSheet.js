document.getElementById("fichaDnDForm").addEventListener("submit", function (event) {
    event.preventDefault();

    // Recupera o username armazenado no login
    const username = localStorage.getItem("username");
    const userID = localStorage.getItem("userId");

    if (!username) {
        document.getElementById("mensagem").innerText = "Usuário não autenticado. Faça login novamente.";
        return;
    }

    const ficha = {
        nomePersonagem: document.getElementById("nomePersonagem").value,
        nomeDoJogador: document.getElementById("nomeDoJogador").value,
        classe: document.getElementById("classe").value,
        nivel: parseInt(document.getElementById("nivel").value),
        forca: parseInt(document.getElementById("forca").value),
        destreza: parseInt(document.getElementById("destreza").value),
        carisma: parseInt(document.getElementById("carisma").value),
        inteligencia: parseInt(document.getElementById("inteligencia").value),
        sobrevivencia: parseInt(document.getElementById("sobrevivencia").value),
        furtividade: parseInt(document.getElementById("furtividade").value),
        intimidacao: parseInt(document.getElementById("intimidacao").value)
    };

    // Envia para a URL com o username
    fetch(`http://localhost:8080/api/dnd?userId=${userID}`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(ficha)
    })
    .then(response => {
        if (response.ok) {
            document.getElementById("mensagem").innerText = "Ficha criada com sucesso!";
        } else {
            response.text().then(text => {
                document.getElementById("mensagem").innerText = "Erro: " + text;
            });
        }
    })
    .catch(error => {
        console.error("Erro:", error);
        document.getElementById("mensagem").innerText = "Erro ao conectar com o servidor.";
    });
});
