package com.apress.prospring4.ch6;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-14
 * Time: 17:00
 * Declaration: All Rights Reserved !!!
 */
public interface ContactDao {
    List<Contact> findAll();
    List<Contact> findByFirstName(String firstName);
    String findFirstNameById(Long id);
    List<Contact> findAllWithDetail();
    void insert(Contact contact);
    void insertWithDetail(Contact contact);
    void update(Contact contact);
}
