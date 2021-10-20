package com.tecmanic.goservices.ModelClass;

public class Home3bean {
    private  String address;
    private  String saloonname;

    public Home3bean() {
    }

    public Home3bean(String address, String saloonname) {
        this.address = address;
        this.saloonname = saloonname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSaloonname() {
        return saloonname;
    }

    public void setSaloonname(String saloonname) {
        this.saloonname = saloonname;
    }
}
