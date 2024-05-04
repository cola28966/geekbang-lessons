package org.example.thingking.in.spring.ioc.overview.domain;


import org.example.thingking.in.spring.ioc.overview.annotation.Super;

@Super
public class SuperUser extends  User{

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
