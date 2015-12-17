package com.apress.prospring4.ch6;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-14
 * Time: 16:05
 * Declaration: All Rights Reserved !!!
 */
public interface ContactDao {
    List<Contact> findAll();
    String findLastNameById(Long id);
}
