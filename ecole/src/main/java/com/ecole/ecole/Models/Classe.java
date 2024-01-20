package com.ecole.ecole.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Classe")
public class Classe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idclasse",nullable = false,updatable = false)
    private Long id;
    @Column
    private String lib;
    @ManyToOne(targetEntity = Niveau.class)
    @JoinColumn(name = "id_niveau")
    private Niveau niveau;



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

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }
}
