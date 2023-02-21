package com.androidaxe.getmypg.Module;

public class PGOwner {
    private String uId, name, profile, contact;

    public PGOwner() {
    }

    public PGOwner(String uId, String name, String profile, String contact) {
        this.uId = uId;
        this.name = name;
        this.profile = profile;
        this.contact = contact;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
