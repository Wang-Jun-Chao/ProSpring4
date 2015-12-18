package com.apress.prospring4.ch8;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-17
 * Time: 15:34
 * Declaration: All Rights Reserved !!!
 */
public interface ContactAuditService {
    List<ContactAudit> findAll();
    ContactAudit findById(Long id);
    ContactAudit save(ContactAudit contact);
}
