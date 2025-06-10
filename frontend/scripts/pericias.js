document.addEventListener('DOMContentLoaded', function() {
    const bonusDeProficiencia = document.getElementById('bonusDeProficiencia-id');
    
    // Função para calcular modificador
    function calcularModificador(valor) {
        return Math.floor((valor - 10) / 2);
    }

    function atualizarModificador(inputId, modificadorId) {
        const input = document.getElementById(inputId);
        const modificador = document.getElementById(modificadorId);
        
        if (input && modificador) {
            input.addEventListener('input', function() {
                const valor = parseInt(this.value) || 0;
                const mod = calcularModificador(valor);
                modificador.textContent = mod;
                modificador.className = 'modificador ' + (mod > 0 ? 'positivo' : mod < 0 ? 'negativo' : 'neutro');
            });
            
            // Atualiza o modificador inicialmente
            const valorInicial = parseInt(input.value) || 0;
            const modInicial = calcularModificador(valorInicial);
            modificador.textContent = modInicial;
            modificador.className = 'modificador ' + (modInicial > 0 ? 'positivo' : modInicial < 0 ? 'negativo' : 'neutro');
        }
    }

    // Atributos principais
    atualizarModificador('forca', 'modificador-forca');
    atualizarModificador('destreza', 'modificador-destreza');
    atualizarModificador('constituicao', 'modificador-constituicao');
    atualizarModificador('inteligencia', 'modificador-inteligencia');
    atualizarModificador('sabedoria', 'modificador-sabedoria');
    atualizarModificador('carisma', 'modificador-carisma');

    // Testes de resistência (IDs atualizados)
    atualizarModificador('forca-teste', 'modificador-teste-forca');
    atualizarModificador('destreza-teste', 'modificador-teste-destreza');
    atualizarModificador('constituicao-teste', 'modificador-teste-constituicao');
    atualizarModificador('inteligencia-teste', 'modificador-teste-inteligencia');
    atualizarModificador('sabedoria-teste', 'modificador-teste-sabedoria');
    atualizarModificador('carisma-teste', 'modificador-teste-carisma');

    // Perícias
    atualizarModificador('acrobacia', 'modificador-acrobacia');
    atualizarModificador('arcanismo', 'modificador-arcanismo');
    atualizarModificador('atletismo', 'modificador-atletismo');
    atualizarModificador('atuacao', 'modificador-atuacao');
    atualizarModificador('blefar', 'modificador-blefar');
    atualizarModificador('furtividade', 'modificador-furtividade');
    atualizarModificador('historia', 'modificador-historia');
    atualizarModificador('intimidacao', 'modificador-intimidacao');
    atualizarModificador('intuicao', 'modificador-intuicao');
    atualizarModificador('investigacao', 'modificador-investigacao');
    atualizarModificador('lidarComAnimais', 'modificador-lidarComAnimais');
    atualizarModificador('medicina', 'modificador-medicina');
    atualizarModificador('natureza', 'modificador-natureza');
    atualizarModificador('percepcao', 'modificador-percepcao');
    atualizarModificador('persuasao', 'modificador-persuasao');
    atualizarModificador('prestidigitacao', 'modificador-prestidigitacao');
    atualizarModificador('religiao', 'modificador-religiao');
    atualizarModificador('sobrevivencia', 'modificador-sobrevivencia');

    // Adiciona validação para campos numéricos
    document.querySelectorAll('input[type="number"]').forEach(input => {
        input.addEventListener('input', function() {
            const valor = parseInt(this.value);
            if (isNaN(valor)) {
                this.value = '';
            } else if (valor < 0) {
                this.value = 0;
            }
        });
    });
});
