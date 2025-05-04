document.getElementById("cadastroForm").addEventListener("submit", function (event) {
    event.preventDefault(); // evita recarregar a página

    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    fetch("http://localhost:8080/api/users/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ username, password })
    })
    .then(response => {
        if (response.ok) {
            document.getElementById("mensagem").innerText = "Usuário cadastrado com sucesso!";
            // Você pode redirecionar após alguns segundos se quiser
            // setTimeout(() => window.location.href = "index.html", 2000);
        } else {
            document.getElementById("mensagem").innerText = "Erro ao cadastrar.";
        }
    })
    .catch(error => {
        console.error("Erro:", error);
        document.getElementById("mensagem").innerText = "Erro na requisição.";
    });
});

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
            document.getElementById("mensagem").innerText = "Login realizado com sucesso!";
            // Redirecionar para página principal
            // window.location.href = "home.html";
        } else {
            document.getElementById("mensagem").innerText = "Usuário ou senha inválidos.";
        }
    })
    .catch(error => {
        console.error("Erro:", error);
        document.getElementById("mensagem").innerText = "Erro ao conectar com o servidor.";
    });
});

