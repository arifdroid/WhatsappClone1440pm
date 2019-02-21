package com.example.myapplication;

public class Contact {

    private String nameContactClass;
    private String phoneContactClass;

    public Contact(String nameContactClass, String phoneContactClass) {
        this.nameContactClass = nameContactClass;
        this.phoneContactClass = phoneContactClass;
    }

    public String getNameContactClass() {
        return nameContactClass;
    }

    public String getPhoneContactClass() {
        return phoneContactClass;
    }
}
