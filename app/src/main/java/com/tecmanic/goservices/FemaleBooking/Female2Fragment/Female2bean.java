package com.tecmanic.goservices.FemaleBooking.Female2Fragment;

public class Female2bean {

    private String name;
    private  String price;

    public Female2bean(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public Female2bean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
