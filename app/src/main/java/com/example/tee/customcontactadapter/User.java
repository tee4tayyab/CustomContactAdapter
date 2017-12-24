package com.example.tee.customcontactadapter;

/**
 * Created by Tee on 10/28/2017.
 */

public class User {

    String name;
    String PhoneNumber;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }

    public User(String name, String phoneNumber) {
        this.name = name;
        this.PhoneNumber = phoneNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
