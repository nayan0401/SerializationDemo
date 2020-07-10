package com.serializationdemo.app;

import java.io.Serializable;

public class UserModel implements Serializable {

    String name, contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
