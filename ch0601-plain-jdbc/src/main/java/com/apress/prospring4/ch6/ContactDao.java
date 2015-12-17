package com.apress.prospring4.ch6;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-14
 * Time: 14:42
 * Declaration: All Rights Reserved !!!
 */
public interface ContactDao {
    List<Contact> findAll();

    List<Contact> findByFirstName(String firstName);

    String findLastNameById(Long id);

    String findFirstNameById(Long id);

    void insert(Contact contact);

    void update(Contact contact);

    void delete(Long contactId);
}
