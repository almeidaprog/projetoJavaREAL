//     document.getElementById("fichaDnDForm").addEventListener("submit", function (event) {
//     event.preventDefault();

<<<<<<< HEAD
    // Recupera o username armazenado no login
    const username = localStorage.getItem("username");
    const userID = localStorage.getItem("userId");
=======
//     // Recupera o username armazenado no login
//     const username = localStorage.getItem("username");
>>>>>>> f5d8caadcea6b59c88a35f2f4953e613c132a36c

//     if (!username) {
//         document.getElementById("mensagem").innerText = "Usuário não autenticado. Faça login novamente.";
//         return;
//     }

//     const ficha = {
//         nomePersonagem: document.getElementById("nomePersonagem").value,
//         nomeDoJogador: document.getElementById("nomeDoJogador").value,
//         classe: document.getElementById("classe").value,
//         nivel: parseInt(document.getElementById("nivel").value),
//         forca: parseInt(document.getElementById("forca").value),
//         destreza: parseInt(document.getElementById("destreza").value),
//         carisma: parseInt(document.getElementById("carisma").value),
//         inteligencia: parseInt(document.getElementById("inteligencia").value),
//         sobrevivencia: parseInt(document.getElementById("sobrevivencia").value),
//         furtividade: parseInt(document.getElementById("furtividade").value),
//         intimidacao: parseInt(document.getElementById("intimidacao").value)
//     };

<<<<<<< HEAD
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
=======
//     // Envia para a URL com o username
//     fetch(`http://localhost:8080/api/dnd/${username}`, {
//         method: "POST",
//         headers: {
//             "Content-Type": "application/json"
//         },
//         body: JSON.stringify(ficha)
//     })
//     .then(response => {
//         if (response.ok) {
//             document.getElementById("mensagem").innerText = "Ficha criada com sucesso!";
//         } else {
//             response.text().then(text => {
//                 document.getElementById("mensagem").innerText = "Erro: " + text;
//             });
//         }
//     })
//     .catch(error => {
//         console.error("Erro:", error);
//         document.getElementById("mensagem").innerText = "Erro ao conectar com o servidor.";
//     });
// });

const forcaInput = document.getElementById("forca");
const modSpan = document.getElementById("modificador-forca");

forcaInput.addEventListener("input", () => {
  const valor = parseInt(forcaInput.value);
  if (!isNaN(valor)) {
    const modificador = Math.floor((valor - 10) / 2);
    modSpan.textContent = modificador >= 0 ? `+${modificador}` : modificador;
  } else {
    modSpan.textContent = "";
  }
>>>>>>> f5d8caadcea6b59c88a35f2f4953e613c132a36c
});



   


