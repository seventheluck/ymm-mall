package com.yangmama.mall.dao.impl;

import com.yangmama.mall.dao.LocalOrderSummaryDao;
import com.yangmama.mall.model.LocalOrderSummary;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

@Repository
@Slf4j
public class LocalOrderSummaryDaoImpl implements LocalOrderSummaryDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public void save(LocalOrderSummary localOrderSummary) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(localOrderSummary);
    }

    @Override
    public void delete(Long id) {
        Session currentSession = entityManager.unwrap(Session.class);
        LocalOrderSummary localOrderSummary = currentSession.get(LocalOrderSummary.class, id);
        currentSession.delete(localOrderSummary);
    }

    @Override
    public LocalOrderSummary queryByProductIdAndShippingMethod(Long productId, String shippingMethod) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<LocalOrderSummary> query = currentSession.createQuery(
                "from LocalOrderSummary  los where los.localProduct.id = :productId and los.shippingMethod =: shippingMethod");
        query.setParameter("productId", productId);
        query.setParameter("shippingMethod", shippingMethod);
        try {
            return query.getSingleResult();
        } catch (NoResultException exception) {
            log.info(exception.getMessage());
            return null;
        }
    }
}
