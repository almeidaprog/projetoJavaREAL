package com.rpgsheets.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DnDSheet> fichasDnd;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //FICHA DE D&D
    public List<DnDSheet> getFichasDnd() {
        return fichasDnd;
    }

    public void setFichasDnd(List<DnDSheet> fichasDnd) {
        this.fichasDnd = fichasDnd;
    }
    //FICHA DE D&D
}
