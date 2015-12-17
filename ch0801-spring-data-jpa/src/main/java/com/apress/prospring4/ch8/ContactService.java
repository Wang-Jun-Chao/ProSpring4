package com.apress.prospring4.ch8;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-15
 * Time: 17:04
 * Declaration: All Rights Reserved !!!
 */
public interface ContactService {
    List<Contact> findAll();

    List<Contact> findByFirstName(String firstName);

    List<Contact> findByFirstNameAndLastName(String firstName, String lastName);
}
