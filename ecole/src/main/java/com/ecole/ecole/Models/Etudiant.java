package com.ecole.ecole.Models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "étudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idétudiant",nullable = false,updatable = false)
    private Long id;
    @Column()
    private String nom;
    @Column(name = "prenom")
    private String preNom;


    public Etudiant() {
    }

    public Etudiant(Long id, String nom, String preNom) {
        this.id = id;
        this.nom = nom;
        this.preNom = preNom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPreNom() {
        return preNom;
    }

    public void setPreNom(String preNom) {
        this.preNom = preNom;
    }
}
