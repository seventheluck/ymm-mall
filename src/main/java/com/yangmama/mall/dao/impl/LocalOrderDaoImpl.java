package com.yangmama.mall.dao.impl;

import com.yangmama.mall.dao.LocalOrderDao;
import com.yangmama.mall.model.LocalOrder;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import java.util.List;

@Repository
@Slf4j
public class LocalOrderDaoImpl implements LocalOrderDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<LocalOrder> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<LocalOrder> query = currentSession.createQuery("from LocalOrder l where l.status = :status");
        query.setParameter("status", "open");
        return query.getResultList();
    }



    @Override
    public LocalOrder get(Long id) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(LocalOrder.class, id);
    }

    @Override
    public List<LocalOrder> getByShippingMethod(String shippingMethod) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<LocalOrder> query = currentSession.createQuery("from LocalOrder l where l.shippingMethod = :shippingMethod and l.status = :status");
        query.setParameter("shippingMethod", shippingMethod);
        query.setParameter("status", "open");
        return query.getResultList();
    }

    @Override
    public List<LocalOrder> getByStatus(List<String> status) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<LocalOrder> query = currentSession.createQuery("from LocalOrder l where l.status in :status");
        query.setParameter("status", status);
        return query.getResultList();
    }

    @Override
    public LocalOrder getByDisplayid(String displayId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<LocalOrder> query = currentSession.createQuery("from LocalOrder l where l.displayId = :displayId");
        query.setParameter("displayId", displayId);
        try {
            return query.getSingleResult();
        } catch (NoResultException exception) {
            log.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public void save(LocalOrder localOrder) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(localOrder);
    }

    @Override
    public void delete(Long id) {
        Session currentSession = entityManager.unwrap(Session.class);
        LocalOrder localOrder = currentSession.get(LocalOrder.class, id);
        currentSession.delete(localOrder);
    }
}
