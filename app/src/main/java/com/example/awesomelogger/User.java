package com.example.awesomelogger;

import com.example.annotation.AwesomeLogger;

/**
 * Created by igor on 1/2/17.
 */
@AwesomeLogger
public class User {
    String firstName;
    String lastName;
    String city;

    public User(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
