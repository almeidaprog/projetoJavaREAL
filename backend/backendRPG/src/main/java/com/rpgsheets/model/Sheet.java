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

    // Getters e Setters
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
}
