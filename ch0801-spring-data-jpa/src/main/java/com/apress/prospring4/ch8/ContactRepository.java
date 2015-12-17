package com.apress.prospring4.ch8;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-15
 * Time: 17:04
 * Declaration: All Rights Reserved !!!
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {
    List<Contact> findByFirstName(String firstName);
    List<Contact> findByFirstNameAndLastName(String firstName, String lastName);
}
