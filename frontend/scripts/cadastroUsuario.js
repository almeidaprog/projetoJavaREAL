const cadastroForm = document.getElementById("cadastroForm");

if (cadastroForm) {
    cadastroForm.addEventListener("submit", function (event) {
        event.preventDefault();
        const username = document.getElementById("username").value;
        const password = document.getElementById("password").value;

        fetch("http://localhost:8080/api/users/register", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ username, password })
        })
        .then(response => {
            if (response.ok) {
                document.getElementById("mensagem").innerText = "Usuário cadastrado com sucesso!";
                setTimeout(() => window.location.href = "login.html", 2000);
            } else {
                document.getElementById("mensagem").innerText = "Erro ao cadastrar.";
            }
        })
        .catch(error => {
            console.error("Erro:", error);
            document.getElementById("mensagem").innerText = "Erro na requisição.";
        });
    });
}