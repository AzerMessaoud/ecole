package com.ecole.ecole.DTOs;

import java.io.Serializable;

public class ClasseDTO implements Serializable {
    private Long id ;
    private String lib;
    private Long idNiveau;
    public ClasseDTO() {
    }

    public Long getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(Long idNiveau) {
        this.idNiveau = idNiveau;
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


