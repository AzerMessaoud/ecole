package com.ecole.ecole.Models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "Club")
public class Club implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    @Column(name = "clublib")
    private String clubLib;



    public Club() {
    }

    public Club(Long id, String clubLib) {
        this.id = id;
        this.clubLib = clubLib;
    }

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
