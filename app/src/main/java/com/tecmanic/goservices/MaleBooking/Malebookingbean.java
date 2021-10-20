package com.tecmanic.goservices.MaleBooking;

public class Malebookingbean {

    private  int shoapImage;
    private  String location;
    private  String shoapname;
    private  String opentime;
    private String closetime;

    public Malebookingbean(int shoapImage, String location, String shoapname, String opentime, String closetime) {
        this.shoapImage = shoapImage;
        this.location = location;
        this.shoapname = shoapname;
        this.opentime = opentime;
        this.closetime = closetime;
    }

    public Malebookingbean() {
    }

    public int getShoapImage() {
        return shoapImage;
    }

    public void setShoapImage(int shoapImage) {
        this.shoapImage = shoapImage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShoapname() {
        return shoapname;
    }

    public void setShoapname(String shoapname) {
        this.shoapname = shoapname;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    public String getClosetime() {
        return closetime;
    }

    public void setClosetime(String closetime) {
        this.closetime = closetime;
    }
}
