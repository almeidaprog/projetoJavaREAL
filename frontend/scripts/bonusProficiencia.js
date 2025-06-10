document.addEventListener('DOMContentLoaded', function() {
    // Garante que os elementos existam
    const nivelInput = document.getElementById('nivel');
    const bonusProficienciaInput = document.getElementById('bonusDeProficiencia');
    const modificadorProficiencia = document.getElementById('modificador-proficiencia');

    if (!nivelInput || !bonusProficienciaInput || !modificadorProficiencia) {
        console.error('Elementos necessários não encontrados');
        return;
    }

    // Função para calcular o bônus de proficiência
    function calcularBonusProficiencia(nivel) {
        const bonus = Math.floor(nivel / 4) + 2;
        return bonus;
    }

    // Função para atualizar o valor e o modificador
    function atualizarBonusProficiencia() {
        const nivel = parseInt(nivelInput.value) || 1;
        const bonus = calcularBonusProficiencia(nivel);
        
        // Atualiza o valor do input
        bonusProficienciaInput.value = bonus;
        
        // Atualiza o modificador
        modificadorProficiencia.textContent = bonus;
        modificadorProficiencia.className = 'modificador ' + 
            (bonus > 0 ? 'positivo' : bonus < 0 ? 'negativo' : 'neutro');
    }

    // Adiciona evento de input
    nivelInput.addEventListener('input', atualizarBonusProficiencia);
    
    // Atualiza inicialmente
    atualizarBonusProficiencia();
});
