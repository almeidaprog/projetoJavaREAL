document.getElementById("fichaDnDForm").addEventListener("submit", function (event) {
    event.preventDefault();
    console.log("Formulário submetido");

    const username = localStorage.getItem("username");
    const userID = localStorage.getItem("userId");
    console.log("Username:", username);
    console.log("UserID:", userID);

    if (!username || !userID) {
        document.getElementById("mensagem").innerText = "Usuário não autenticado. Faça login novamente.";
        return;
    }

    const ficha = {
        nomePersonagem: document.getElementById("nomePersonagem").value.trim(),
        nomeDoJogador: document.getElementById("nomeJogador").value.trim(),
        classe: document.getElementById("classe").value.trim(),
        nivel: parseInt(document.getElementById("nivel").value) || 0,
        antecedente: document.getElementById("antecedente").value.trim(),
        raca: document.getElementById("raca").value.trim(),
        tendencia: document.getElementById("tendencia").value.trim(),
        xp: parseInt(document.getElementById("xp").value) || 0,
        forca: parseInt(document.getElementById("forca").value) || 0,
        destreza: parseInt(document.getElementById("destreza").value) || 0,
        constituicao: parseInt(document.getElementById("constituicao").value) || 0,
        inteligencia: parseInt(document.getElementById("inteligencia").value) || 0,
        sabedoria: parseInt(document.getElementById("sabedoria").value) || 0,
        carisma: parseInt(document.getElementById("carisma").value) || 0,
        bonusProficiencia: parseInt(document.getElementById("bonusProficiencia").value) || 0,
        forcaTeste: parseInt(document.getElementById("forca-teste-valor").value) || 0,
        destrezaTeste: parseInt(document.getElementById("destreza-teste-valor").value) || 0,
        constituicaoTeste: parseInt(document.getElementById("constituicao-teste-valor").value) || 0,
        inteligenciaTeste: parseInt(document.getElementById("inteligencia-teste-valor").value) || 0,
        sabedoriaTeste: parseInt(document.getElementById("sabedoria-teste-valor").value) || 0,
        carismaTeste: parseInt(document.getElementById("carisma-teste-valor").value) || 0,
        acrobaciaValor: parseInt(document.getElementById("acrobacia-valor").value) || 0,
        arcanismoValor: parseInt(document.getElementById("arcanismo-valor").value) || 0,
        atletismoValor: parseInt(document.getElementById("atletismo-valor").value) || 0,
        atuacaoValor: parseInt(document.getElementById("atuacao-valor").value) || 0,
        blefarValor: parseInt(document.getElementById("blefar-valor").value) || 0,
        furtividadeValor: parseInt(document.getElementById("furtividade-valor").value) || 0,
        historiaValor: parseInt(document.getElementById("historia-valor").value) || 0,
        intimidacaoValor: parseInt(document.getElementById("intimidacao-valor").value) || 0,
        intuicaoValor: parseInt(document.getElementById("intuicao-valor").value) || 0,
        investigacaoValor: parseInt(document.getElementById("investigacao-valor").value) || 0,
        lidarComAnimaisValor: parseInt(document.getElementById("lidarComAnimais-valor").value) || 0,
        medicinaValor: parseInt(document.getElementById("medicina-valor").value) || 0,
        naturezaValor: parseInt(document.getElementById("natureza-valor").value) || 0,
        percecpcaoValor: parseInt(document.getElementById("percepcao-valor").value) || 0,
        persuasaoValor: parseInt(document.getElementById("persuasao-valor").value) || 0,
        prestidigitacaoValor: parseInt(document.getElementById("prestidigitacao-valor").value) || 0,
        religiaoValor: parseInt(document.getElementById("religiao-valor").value) || 0,
        sobrevivenciaValor: parseInt(document.getElementById("sobrevivencia-valor").value) || 0,
        sabedoriaPassiva: parseInt(document.getElementById("sabedoriaPassiva").value) || 0,
        classeArmadura: parseInt(document.getElementById("classeArmadura").value) || 0,
        iniciativa: parseInt(document.getElementById("iniciativa").value) || 0,
        deslocamento: parseInt(document.getElementById("deslocamento").value) || 0,
        pvTotais: parseInt(document.getElementById("pvTotais").value) || 0,
        pvAtuais: parseInt(document.getElementById("pvAtuais").value) || 0,
        pvTemporarios: parseInt(document.getElementById("pvTemporarios").value) || 0,
        dadosVida: document.getElementById("dadosVida").value.trim(),
        tracosDePersonalidade: document.getElementById("tracosDePersonalidade").value.trim(),
        ideais: document.getElementById("ideais").value.trim(),
        ligacoes: document.getElementById("ligacoes").value.trim(),
        defeitos: document.getElementById("defeitos").value.trim(),
        caracteristicasEHabilidades: document.getElementById("caracteristicasEHabilidades").value.trim(),
        idiomasEOutrasProficiencias: document.getElementById("idiomasEOutrasProficiencias").value.trim(),
        equipamentosLista: document.getElementById("equipamentosLista").value.trim(),
        pc: parseInt(document.getElementById("pc").value) || 0,
        pp: parseInt(document.getElementById("pp").value) || 0,
        pe: parseInt(document.getElementById("pe").value) || 0,
        po: parseInt(document.getElementById("po").value) || 0,
        pl: parseInt(document.getElementById("pl").value) || 0
    };

    console.log("Dados da ficha:", ficha);

    fetch(`http://localhost:8080/api/dnd?userId=${userID}`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(ficha)
    })
    .then(response => {
        console.log("Resposta do servidor:", response);
        if (!response.ok) {
            return response.text().then(text => {
                console.error("Erro na resposta:", text);
                throw new Error(text || "Erro ao criar ficha");
            });
        }
        // Só tenta ler JSON se houver conteúdo
        const contentLength = response.headers.get("Content-Length");
        if (contentLength === "0" || response.status === 204) {
            return {};
        }
        return response.json().catch(() => ({}));
    })
    .then(data => {
        console.log("Ficha criada com sucesso:", data);
        document.getElementById("mensagem").innerText = "Ficha criada com sucesso!";
        setTimeout(() => {
            window.location.href = "dndSheet.html";
        }, 2000);
    })
    .catch(error => {
        console.error("Erro completo:", error);
        document.getElementById("mensagem").innerText = "Erro ao criar ficha: " + error.message;
    });
});
