package com.apress.prospring4.ch9;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: 王俊超
 * Date: 2015-12-18
 * Time: 16:03
 * Declaration: All Rights Reserved !!!
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {
    @Query("select count(c) from Contact c")
    Long countAllContacts();
}
