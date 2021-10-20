package com.tecmanic.goservices.unisex.ViewPagersUnisex;

public class UnisexBean {

    private String name;
    private  String price;

    public UnisexBean(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public UnisexBean() {
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
