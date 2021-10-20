package com.tecmanic.goservices.toprated;

public class Topratedbean {
    private  int image;
    private  String location;
    private String shoapname;
    private String oepntime;
    private String closetime;

    public Topratedbean() {
    }

    public Topratedbean(int image, String location, String shoapname, String oepntime, String closetime) {
        this.image = image;
        this.location = location;
        this.shoapname = shoapname;
        this.oepntime = oepntime;
        this.closetime = closetime;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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

    public String getOepntime() {
        return oepntime;
    }

    public void setOepntime(String oepntime) {
        this.oepntime = oepntime;
    }

    public String getClosetime() {
        return closetime;
    }

    public void setClosetime(String closetime) {
        this.closetime = closetime;
    }
}
