package com.rpgsheets.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Sheet {

    private String nomePersonagem;
    private String nomeDoJogador;

    private int forca;
    private int destreza;
    private int carisma;
    private int inteligencia;

    private int sobrevivencia;
    private int furtividade;
    private int intimidacao;

    private int constituicao;
    private int sabedoria;
    private int acrobacia;
    private int arcanismo;
    private int atletismo;
    private int atuacao;
    private int blefar;
    private int historia;
    private int intuicao;
    private int investigacao;
    private int lidarComAnimais;
    private int medicina;
    private int natureza;
    private int percepcao;
    private int persuasao;
    private int prestidigitacao;
    private int religiao;

    // getters e setters
    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSobrevivencia() {
        return sobrevivencia;
    }

    public void setSobrevivencia(int sobrevivencia) {
        this.sobrevivencia = sobrevivencia;
    }

    public int getFurtividade() {
        return furtividade;
    }

    public void setFurtividade(int furtividade) {
        this.furtividade = furtividade;
    }

    public int getIntimidacao() {
        return intimidacao;
    }

    public void setIntimidacao(int intimidacao) {
        this.intimidacao = intimidacao;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getAcrobacia() {
        return acrobacia;
    }

    public void setAcrobacia(int acrobacia) {
        this.acrobacia = acrobacia;
    }

    public int getArcanismo() {
        return arcanismo;
    }

    public void setArcanismo(int arcanismo) {
        this.arcanismo = arcanismo;
    }

    public int getAtletismo() {
        return atletismo;
    }

    public void setAtletismo(int atletismo) {
        this.atletismo = atletismo;
    }

    public int getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(int atuacao) {
        this.atuacao = atuacao;
    }

    public int getBlefar() {
        return blefar;
    }

    public void setBlefar(int blefar) {
        this.blefar = blefar;
    }

    public int getHistoria() {
        return historia;
    }

    public void setHistoria(int historia) {
        this.historia = historia;
    }

    public int getIntuicao() {
        return intuicao;
    }

    public void setIntuicao(int intuicao) {
        this.intuicao = intuicao;
    }

    public int getInvestigacao() {
        return investigacao;
    }

    public void setInvestigacao(int investigacao) {
        this.investigacao = investigacao;
    }

    public int getLidarComAnimais() {
        return lidarComAnimais;
    }

    public void setLidarComAnimais(int lidarComAnimais) {
        this.lidarComAnimais = lidarComAnimais;
    }

    public int getMedicina() {
        return medicina;
    }

    public void setMedicina(int medicina) {
        this.medicina = medicina;
    }

    public int getNatureza() {
        return natureza;
    }

    public void setNatureza(int natureza) {
        this.natureza = natureza;
    }

    public int getPercepcao() {
        return percepcao;
    }

    public void setPercepcao(int percepcao) {
        this.percepcao = percepcao;
    }

    public int getPersuasao() {
        return persuasao;
    }

    public void setPersuasao(int persuasao) {
        this.persuasao = persuasao;
    }

    public int getPrestidigitacao() {
        return prestidigitacao;
    }

    public void setPrestidigitacao(int prestidigitacao) {
        this.prestidigitacao = prestidigitacao;
    }

    public int getReligiao() {
        return religiao;
    }

    public void setReligiao(int religiao) {
        this.religiao = religiao;
    }
}
