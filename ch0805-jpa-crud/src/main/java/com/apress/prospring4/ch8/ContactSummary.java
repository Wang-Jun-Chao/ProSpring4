package com.apress.prospring4.ch8;

import java.io.Serializable;

/**
 * Author: 王俊超
 * Date: 2015-12-18
 * Time: 15:14
 * Declaration: All Rights Reserved !!!
 */
public class ContactSummary implements Serializable {
    private String firstName;
    private String lastName;
    private String homeTelNumber;

    public ContactSummary(String firstName, String lastName,
                          String homeTelNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeTelNumber = homeTelNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHomeTelNumber() {
        return homeTelNumber;
    }

    public String toString() {
        return "First name: " + firstName + " Last Name: " + lastName
                + " Home Phone: " + homeTelNumber;
    }
}
