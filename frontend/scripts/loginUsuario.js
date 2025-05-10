
document.getElementById("loginForm").addEventListener("submit", function (event) {
    event.preventDefault();

    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    fetch("http://localhost:8080/api/users/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ username, password })
    })
    .then(response => response.text())
    .then(data => {
        if (data === "Login bem-sucedido!") {
            localStorage.setItem("username", username);
            document.getElementById("mensagem").innerText = `Olá, ${username}! Você está logado.`;
            setTimeout(() => window.location.href = "index.html", 2000);
        } else {
            document.getElementById("mensagem").innerText = "Usuário ou senha inválidos.";
        }
    })
    .catch(error => {
        console.error("Erro:", error);
        document.getElementById("mensagem").innerText = "Erro ao conectar com o servidor.";
    });
});