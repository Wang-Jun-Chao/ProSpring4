package com.apress.prospring4.ch8;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-17
 * Time: 14:44
 * Declaration: All Rights Reserved !!!
 */
public interface ContactService {
    List<Contact> findAll();

    List<Contact> findAllWithDetail();

    Contact findById(Long id);

    Contact save(Contact contact);

    void delete(Contact contact);

    List<Contact> findAllByNativeQuery();

    List<Contact> findByCriteriaQuery(String firstName, String lastName);
}
