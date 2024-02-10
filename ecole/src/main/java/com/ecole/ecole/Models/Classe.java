package com.ecole.ecole.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Classe")
public class Classe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    @Column
    private String lib;
    private int rate;





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
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classe classe = (Classe) o;
        return rate == classe.rate
                && Objects.equals(id, classe.id)
                && Objects.equals(lib, classe.lib)
                && Objects.equals(niveau, classe.niveau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lib, rate, niveau);
    }
    //first commit


    @Override
    public String toString() {
        return "Classe{" +
                "id=" + id +
                ", lib='" + lib + '\'' +
                ", rate=" + rate +
                ", niveau=" + niveau +
                '}';
    }
}
