package com.apress.prospring4.ch9;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-18
 * Time: 16:04
 * Declaration: All Rights Reserved !!!
 */
@Service("contactService")
@Repository
public class ContactServiceImpl implements ContactService {
    private ContactRepository contactRepository;
    private TransactionTemplate transactionTemplate;

    /**
     * Persistence context是由一组受托管的实体对象实例所构成的集合。
     * 它受entity manager 的管理。Entity manager追踪persistence context
     * 中所有对象的修改和更新情况，并根据指定的flush模式（本章稍后会做讨论）
     * 将这些修改保存到数据库中。一旦persistence context被关闭，所有实体对
     * 象实例都会脱离EntityManager而成为非托管对象。对象一旦从persistence
     * context中脱离，就不再受entity manager管理了，任何对此对象的状态变更
     * 也将不会被同步到数据库。
     */
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Contact> findAll() {
        return Lists.newArrayList(contactRepository.findAll());
    }

    @Override
    public Contact findById(Long id) {
        return contactRepository.findOne(id);
    }

    @Override
    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public long countAll() {
        return transactionTemplate.execute(new TransactionCallback<Long>() {
            public Long doInTransaction(TransactionStatus transactionStatus) {
                return em.createNamedQuery("Contact.countAll",
                        Long.class).getSingleResult();
            }
        });
    }

    @Autowired
    public void setContactRepository(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Autowired
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
}
