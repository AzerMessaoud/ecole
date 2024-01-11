package com.ecole.ecole.Models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Classe")
public class Classe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idclasse",nullable = false,updatable = false)
    private Long id;
    @Column(name = "classeLib")
    private String lib;
    //relationship


    public Classe() {
    }

    public Classe(Long id, String lib) {
        this.id = id;
        this.lib = lib;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }
}
