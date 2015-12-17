package com.apress.prospring4.ch7;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-15
 * Time: 15:57
 * Declaration: All Rights Reserved !!!
 */
public interface ContactDao {
    List<Contact> findAll();
    List<Contact> findAllWithDetail();
    Contact findById(Long id);
    Contact save(Contact contact);
    void delete(Contact contact);
}
