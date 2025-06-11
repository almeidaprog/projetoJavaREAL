package com.rpgsheets.model;

import jakarta.persistence.*;

@Entity
public class DnDSheet extends Sheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePersonagem;
    private String nomeDoJogador;
    private String classe;
    private int nivel;

    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;

    private int classeArmadura;
    private int iniciativa;
    private int deslocamento;
    private int xp;

    private String tracosDePersonalidade;
    private String ideais;
    private String ligacoes;
    private String defeitos;
    private String caracteristicasEHabilidades;
    private String idiomasEOutrasProficiencias;
    private String equipamentosLista;

    private int pc;
    private int pp;
    private int pe;
    private int po;
    private int pl;

    private int sabedoriaPassiva;
    private int bonusProficiencia;

    // Perícias
    private int acrobaciaValor;
    private int arcanismoValor;
    private int atletismoValor;
    private int atuacaoValor;
    private int blefarValor;
    private int furtividadeValor;
    private int historiaValor;
    private int intimidacaoValor;
    private int intuicaoValor;
    private int investigacaoValor;
    private int lidarComAnimaisValor;
    private int medicinaValor;
    private int naturezaValor;
    private int percecpcaoValor;
    private int persuasaoValor;
    private int prestidigitacaoValor;
    private int religiaoValor;
    private int sobrevivenciaValor;

    // Testes de resistência
    private int forcaTeste;
    private int destrezaTeste;
    private int constituicaoTeste;
    private int inteligenciaTeste;
    private int sabedoriaTeste;
    private int carismaTeste;

    // Extras
    private String antecedente;
    private String raca;
    private String tendencia;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    @Override
    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    @Override
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public void setClasseArmadura(int classeArmadura) {
        this.classeArmadura = classeArmadura;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }

    public void setDeslocamento(int deslocamento) {
        this.deslocamento = deslocamento;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setTracosDePersonalidade(String tracosDePersonalidade) {
        this.tracosDePersonalidade = tracosDePersonalidade;
    }

    public void setIdeais(String ideais) {
        this.ideais = ideais;
    }

    public void setLigacoes(String ligacoes) {
        this.ligacoes = ligacoes;
    }

    public void setDefeitos(String defeitos) {
        this.defeitos = defeitos;
    }

    public void setCaracteristicasEHabilidades(String caracteristicasEHabilidades) {
        this.caracteristicasEHabilidades = caracteristicasEHabilidades;
    }

    public void setIdiomasEOutrasProficiencias(String idiomasEOutrasProficiencias) {
        this.idiomasEOutrasProficiencias = idiomasEOutrasProficiencias;
    }

    public void setEquipamentosLista(String equipamentosLista) {
        this.equipamentosLista = equipamentosLista;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public void setPo(int po) {
        this.po = po;
    }

    public void setPl(int pl) {
        this.pl = pl;
    }

    public void setSabedoriaPassiva(int sabedoriaPassiva) {
        this.sabedoriaPassiva = sabedoriaPassiva;
    }

    public void setBonusProficiencia(int bonusProficiencia) {
        this.bonusProficiencia = bonusProficiencia;
    }

    public void setAcrobaciaValor(int acrobaciaValor) {
        this.acrobaciaValor = acrobaciaValor;
    }

    public void setArcanismoValor(int arcanismoValor) {
        this.arcanismoValor = arcanismoValor;
    }

    public void setAtletismoValor(int atletismoValor) {
        this.atletismoValor = atletismoValor;
    }

    public void setAtuacaoValor(int atuacaoValor) {
        this.atuacaoValor = atuacaoValor;
    }

    public void setBlefarValor(int blefarValor) {
        this.blefarValor = blefarValor;
    }

    public void setFurtividadeValor(int furtividadeValor) {
        this.furtividadeValor = furtividadeValor;
    }

    public void setHistoriaValor(int historiaValor) {
        this.historiaValor = historiaValor;
    }

    public void setIntimidacaoValor(int intimidacaoValor) {
        this.intimidacaoValor = intimidacaoValor;
    }

    public void setIntuicaoValor(int intuicaoValor) {
        this.intuicaoValor = intuicaoValor;
    }

    public void setInvestigacaoValor(int investigacaoValor) {
        this.investigacaoValor = investigacaoValor;
    }

    public void setLidarComAnimaisValor(int lidarComAnimaisValor) {
        this.lidarComAnimaisValor = lidarComAnimaisValor;
    }

    public void setMedicinaValor(int medicinaValor) {
        this.medicinaValor = medicinaValor;
    }

    public void setNaturezaValor(int naturezaValor) {
        this.naturezaValor = naturezaValor;
    }

    public void setPercecpcaoValor(int percecpcaoValor) {
        this.percecpcaoValor = percecpcaoValor;
    }

    public void setPersuasaoValor(int persuasaoValor) {
        this.persuasaoValor = persuasaoValor;
    }

    public void setPrestidigitacaoValor(int prestidigitacaoValor) {
        this.prestidigitacaoValor = prestidigitacaoValor;
    }

    public void setReligiaoValor(int religiaoValor) {
        this.religiaoValor = religiaoValor;
    }

    public void setSobrevivenciaValor(int sobrevivenciaValor) {
        this.sobrevivenciaValor = sobrevivenciaValor;
    }

    public void setForcaTeste(int forcaTeste) {
        this.forcaTeste = forcaTeste;
    }

    public void setDestrezaTeste(int destrezaTeste) {
        this.destrezaTeste = destrezaTeste;
    }

    public void setConstituicaoTeste(int constituicaoTeste) {
        this.constituicaoTeste = constituicaoTeste;
    }

    public void setInteligenciaTeste(int inteligenciaTeste) {
        this.inteligenciaTeste = inteligenciaTeste;
    }

    public void setSabedoriaTeste(int sabedoriaTeste) {
        this.sabedoriaTeste = sabedoriaTeste;
    }

    public void setCarismaTeste(int carismaTeste) {
        this.carismaTeste = carismaTeste;
    }

    public void setAntecedente(String antecedente) {
        this.antecedente = antecedente;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setTendencia(String tendencia) {
        this.tendencia = tendencia;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String getNomePersonagem() {
        return nomePersonagem;
    }

    @Override
    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public int getForca() {
        return forca;
    }

    @Override
    public int getDestreza() {
        return destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    @Override
    public int getInteligencia() {
        return inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    @Override
    public int getCarisma() {
        return carisma;
    }

    public int getClasseArmadura() {
        return classeArmadura;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public int getDeslocamento() {
        return deslocamento;
    }

    public int getXp() {
        return xp;
    }

    public String getTracosDePersonalidade() {
        return tracosDePersonalidade;
    }

    public String getIdeais() {
        return ideais;
    }

    public String getLigacoes() {
        return ligacoes;
    }

    public String getDefeitos() {
        return defeitos;
    }

    public String getCaracteristicasEHabilidades() {
        return caracteristicasEHabilidades;
    }

    public String getIdiomasEOutrasProficiencias() {
        return idiomasEOutrasProficiencias;
    }

    public String getEquipamentosLista() {
        return equipamentosLista;
    }

    public int getPc() {
        return pc;
    }

    public int getPp() {
        return pp;
    }

    public int getPe() {
        return pe;
    }

    public int getPo() {
        return po;
    }

    public int getPl() {
        return pl;
    }

    public int getSabedoriaPassiva() {
        return sabedoriaPassiva;
    }

    public int getBonusProficiencia() {
        return bonusProficiencia;
    }

    public int getAcrobaciaValor() {
        return acrobaciaValor;
    }

    public int getArcanismoValor() {
        return arcanismoValor;
    }

    public int getAtletismoValor() {
        return atletismoValor;
    }

    public int getAtuacaoValor() {
        return atuacaoValor;
    }

    public int getBlefarValor() {
        return blefarValor;
    }

    public int getFurtividadeValor() {
        return furtividadeValor;
    }

    public int getHistoriaValor() {
        return historiaValor;
    }

    public int getIntimidacaoValor() {
        return intimidacaoValor;
    }

    public int getIntuicaoValor() {
        return intuicaoValor;
    }

    public int getInvestigacaoValor() {
        return investigacaoValor;
    }

    public int getLidarComAnimaisValor() {
        return lidarComAnimaisValor;
    }

    public int getMedicinaValor() {
        return medicinaValor;
    }

    public int getNaturezaValor() {
        return naturezaValor;
    }

    public int getPercecpcaoValor() {
        return percecpcaoValor;
    }

    public int getPersuasaoValor() {
        return persuasaoValor;
    }

    public int getPrestidigitacaoValor() {
        return prestidigitacaoValor;
    }

    public int getReligiaoValor() {
        return religiaoValor;
    }

    public int getSobrevivenciaValor() {
        return sobrevivenciaValor;
    }

    public int getForcaTeste() {
        return forcaTeste;
    }

    public int getDestrezaTeste() {
        return destrezaTeste;
    }

    public int getConstituicaoTeste() {
        return constituicaoTeste;
    }

    public int getInteligenciaTeste() {
        return inteligenciaTeste;
    }

    public int getSabedoriaTeste() {
        return sabedoriaTeste;
    }

    public int getCarismaTeste() {
        return carismaTeste;
    }

    public String getAntecedente() {
        return antecedente;
    }

    public String getRaca() {
        return raca;
    }

    public String getTendencia() {
        return tendencia;
    }

    public User getUsuario() {
        return usuario;
    }

    //
//    // Getters e Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getClasse() {
//        return classe;
//    }
//
//    public void setClasse(String classe) {
//        this.classe = classe;
//    }
//
//    public int getNivel() {
//        return nivel;
//    }
//
//    public void setNivel(int nivel) {
//        this.nivel = nivel;
//    }
//
//    public User getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(User usuario) {
//        this.usuario = usuario;
//    }
//
//    public int getConstituicao() {
//        return constituicao;
//    }
//
//    public void setConstituicao(int constituicao) {
//        this.constituicao = constituicao;
//    }
//
//    public int getSabedoria() {
//        return sabedoria;
//    }
//
//    public void setSabedoria(int sabedoria) {
//        this.sabedoria = sabedoria;
//    }
//
//    public int getAcrobacia() {
//        return acrobacia;
//    }
//
//    public void setAcrobacia(int acrobacia) {
//        this.acrobacia = acrobacia;
//    }
//
//    public int getArcanismo() {
//        return arcanismo;
//    }
//
//    public void setArcanismo(int arcanismo) {
//        this.arcanismo = arcanismo;
//    }
//
//    public int getAtletismo() {
//        return atletismo;
//    }
//
//    public void setAtletismo(int atletismo) {
//        this.atletismo = atletismo;
//    }
//
//    public int getAtuacao() {
//        return atuacao;
//    }
//
//    public void setAtuacao(int atuacao) {
//        this.atuacao = atuacao;
//    }
//
//    public int getBlefar() {
//        return blefar;
//    }
//
//    public void setBlefar(int blefar) {
//        this.blefar = blefar;
//    }
//
//    public int getHistoria() {
//        return historia;
//    }
//
//    public void setHistoria(int historia) {
//        this.historia = historia;
//    }
//
//    public int getIntuicao() {
//        return intuicao;
//    }
//
//    public void setIntuicao(int intuicao) {
//        this.intuicao = intuicao;
//    }
//
//    public int getInvestigacao() {
//        return investigacao;
//    }
//
//    public void setInvestigacao(int investigacao) {
//        this.investigacao = investigacao;
//    }
//
//    public int getLidarComAnimais() {
//        return lidarComAnimais;
//    }
//
//    public void setLidarComAnimais(int lidarComAnimais) {
//        this.lidarComAnimais = lidarComAnimais;
//    }
//
//    public int getMedicina() {
//        return medicina;
//    }
//
//    public void setMedicina(int medicina) {
//        this.medicina = medicina;
//    }
//
//    public int getNatureza() {
//        return natureza;
//    }
//
//    public void setNatureza(int natureza) {
//        this.natureza = natureza;
//    }
//
//    public int getPercepcao() {
//        return percepcao;
//    }
//
//    public void setPercepcao(int percepcao) {
//        this.percepcao = percepcao;
//    }
//
//    public int getPersuasao() {
//        return persuasao;
//    }
//
//    public void setPersuasao(int persuasao) {
//        this.persuasao = persuasao;
//    }
//
//    public int getPrestidigitacao() {
//        return prestidigitacao;
//    }
//
//    public void setPrestidigitacao(int prestidigitacao) {
//        this.prestidigitacao = prestidigitacao;
//    }
//
//    public int getReligiao() {
//        return religiao;
//    }
//
//    public void setReligiao(int religiao) {
//        this.religiao = religiao;
//    }
}