package com.tecmanic.goservices.MaleBooking.ViewPageers;

public class ServiceBean {

    private String name;
    private  String price;

    public ServiceBean(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public ServiceBean() {

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
