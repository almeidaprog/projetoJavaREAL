package com.rpgsheets.model;

import jakarta.persistence.*;

@Entity
public class DnDSheet extends Sheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String classe;
    private int nivel;

    @ManyToOne
    @JoinColumn(name = "usuario_id") // Chave estrangeira
    private User usuario;

    // Getters e Setters para os campos novos
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getClasse() { return classe; }
    public void setClasse(String classe) { this.classe = classe; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }


}
