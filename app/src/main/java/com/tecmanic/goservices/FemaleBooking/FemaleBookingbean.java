package com.tecmanic.goservices.FemaleBooking;

public class FemaleBookingbean {


    private  int shoapImage;
    private  String location;
    private  String shoapname;
    private  String opentime;
    private String closetime;

    public FemaleBookingbean(int shoapImage, String location, String shoapname, String opentime, String closetime) {
        this.shoapImage = shoapImage;
        this.location = location;
        this.shoapname = shoapname;
        this.opentime = opentime;
        this.closetime = closetime;
    }

    public FemaleBookingbean() {
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




