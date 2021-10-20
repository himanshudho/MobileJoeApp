package com.tecmanic.goservices.MyBean;

public class Unisexbean {
    private int civ;
    private String name;

    public Unisexbean(int civ, String name) {
        this.civ = civ;
        this.name = name;
    }

    public int getCiv() {
        return civ;
    }

    public void setCiv(int civ) {
        this.civ = civ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
