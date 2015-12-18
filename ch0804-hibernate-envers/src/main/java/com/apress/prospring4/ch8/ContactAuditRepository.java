package com.apress.prospring4.ch8;

import org.springframework.data.repository.CrudRepository;

/**
 * Author: 王俊超
 * Date: 2015-12-18
 * Time: 14:45
 * Declaration: All Rights Reserved !!!
 */
public interface ContactAuditRepository extends CrudRepository<ContactAudit, Long> {
}
