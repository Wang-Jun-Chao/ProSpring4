package com.apress.prospring4.ch4;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 08:55
 * Declaration: All Rights Reserved !!!
 */
public class Contact {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "First name: " + firstName + ", Last name: " + lastName + ", Age: " + age;
    }
}
