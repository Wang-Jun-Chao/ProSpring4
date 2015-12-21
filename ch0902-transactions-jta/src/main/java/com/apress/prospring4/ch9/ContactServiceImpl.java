package com.apress.prospring4.ch9;

import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-20
 * Time: 09:19
 * Declaration: All Rights Reserved !!!
 */
@Service("contactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {

    @PersistenceContext(unitName="emfA")
    private EntityManager emA;

    @PersistenceContext(unitName="emfB")
    private EntityManager emB;

    @Override
    @Transactional(readOnly=true)
    public List<Contact> findAll() {
        return null;
    }

    @Override
    @Transactional(readOnly=true)
    public Contact findById(Long id) {
        return null;
    }

    @Override
    public Contact save(Contact contact) {
        Contact contactB = new Contact();
        contactB.setFirstName(contact.getFirstName());
        contactB.setLastName(contact.getLastName());
        if (contact.getId() == null) {
            emA.persist(contact);
            emB.persist(contactB);
//            throw new JpaSystemException(new PersistenceException());
        } else {
            emA.merge(contact);
            emB.merge(contact);
        }

        return contact;
    }

    @Override
    public long countAll() {
        return 0;
    }
}
