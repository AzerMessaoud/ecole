package com.ecole.ecole.Models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "niveau")
public class Niveau implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idniveau",nullable = false,updatable = false)
    private Long id;
    @Column()
    private String niveauLib;
    //relationship


    public Niveau() {
    }

    public Niveau(Long id, String niveauLib) {
        this.id = id;
        this.niveauLib = niveauLib;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNiveauLib() {
        return niveauLib;
    }

    public void setNiveauLib(String niveauLib) {
        this.niveauLib = niveauLib;
    }
}
