package com.ecole.ecole.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

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
    @ManyToOne(targetEntity = Classe.class)
    @JoinColumn(name = "id_classe")
    private Classe classe;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "étudiant_club",
            joinColumns = @JoinColumn(name = "id_etudiant"),
            inverseJoinColumns = @JoinColumn(name = "id_club"))
    private List<Club> clubsAffecter;

    public List<Club> getClubsAffecter() {
        return clubsAffecter;
    }

    public Etudiant() {
    }
    public Etudiant(Classe classe) {
        this.classe = classe;
    }

    public Etudiant(Long id, String nom, String preNom) {
        this.id = id;
        this.nom = nom;
        this.preNom = preNom;
    }
    public Classe getClasse() {
        return classe;
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
