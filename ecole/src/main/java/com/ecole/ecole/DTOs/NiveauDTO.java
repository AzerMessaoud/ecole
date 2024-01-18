package com.ecole.ecole.DTOs;


import java.io.Serializable;

public class NiveauDTO implements Serializable {
    private Long id;
    private String niveauLib;

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
