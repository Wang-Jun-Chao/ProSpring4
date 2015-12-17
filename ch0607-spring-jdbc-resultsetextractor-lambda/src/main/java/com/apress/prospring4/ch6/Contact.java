package com.apress.prospring4.ch6;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-14
 * Time: 16:04
 * Declaration: All Rights Reserved !!!
 */
public class Contact implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private List<ContactTelDetail> contactTelDetails;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setContactTelDetails(List<ContactTelDetail> contactTelDetails) {
        this.contactTelDetails = contactTelDetails;
    }

    public List<ContactTelDetail> getContactTelDetails() {
        return contactTelDetails;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Contact - Id: " + id + ", First name: " + firstName
                + ", Last name: " + lastName + ", Birthday: " + birthDate;
    }
}
