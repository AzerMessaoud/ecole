package com.ecole.ecole.DTOs;


import java.io.Serializable;

public class ClubDTO implements Serializable {
    private Long id;
    private String clubLib;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClubLib() {
        return clubLib;
    }

    public void setClubLib(String clubLib) {
        this.clubLib = clubLib;
    }
}
