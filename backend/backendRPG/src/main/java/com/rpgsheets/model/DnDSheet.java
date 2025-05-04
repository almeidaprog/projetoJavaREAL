package com.rpgsheets.model;

import jakarta.persistence.*;

@Entity
public class DnDSheet{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String classe;
    private int nivel;

}
