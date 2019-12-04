package main.java.mgb.test.model;

import java.util.List;

public class Championnat {

    private List<Equipe> equipeList;
    private Calendrier calendrier;

    public Championnat(List<Equipe> equipeList)
    {
        this.equipeList = equipeList;
    }
}
