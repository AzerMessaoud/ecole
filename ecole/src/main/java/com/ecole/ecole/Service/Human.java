package com.ecole.ecole.Service;

public class Human {

    public Human(String name) {
        this.name = name;
    }

    String name;


    @Override
    public boolean equals(Object obj) {
        return (this.name != ((Human) obj).name);
    }
}
