package com.example.amdcd;

public class MountPojo {

    private int picture;
    private String codename;
    private String masl;
    private String location;
    private String screenshot;
    private String description;
    private String namedetail;

    public MountPojo(int picture, String codename, String location, String masl, String screenshot, String description, String namedetail) {
        this.picture = picture;
        this.codename = codename;
        this.masl = masl;
        this.location = location;
        this.screenshot = screenshot;
        this.description = description;
        this.namedetail = namedetail;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getMasl() {
        return masl;
    }

    public void setMasl(String masl) {
        this.masl = masl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNamedetail() {
        return namedetail;
    }

    public void setNamedetail(String namedetail) {
        this.namedetail = namedetail;
    }


}
