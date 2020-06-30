package com.yangmama.mall.dao.impl;

import com.yangmama.mall.dao.LocalProductDao;
import com.yangmama.mall.model.LocalProduct;
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
public class LocalProductDaoImpl implements LocalProductDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<LocalProduct> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<LocalProduct> query = currentSession.createQuery("from LocalProduct");
        return query.getResultList();
    }

    @Override
    public LocalProduct get(Long id) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(LocalProduct.class, id);
    }

    @Override
    public LocalProduct getByShopifyIdAndVariantId(String shopifyId, String variantId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<LocalProduct> query = currentSession.createQuery("from LocalProduct l where l.shopifyId = :shopifyId and l.variantId = :variantId");
        query.setParameter("shopifyId", shopifyId);
        query.setParameter("variantId", variantId);
        try {
            return query.getSingleResult();
        } catch (NoResultException exception){
            log.info(exception.getMessage());
            return null;
        }
    }

    @Override
    public List<LocalProduct> getByStatus(String status) {
        return null;
    }

    @Override
    public void save(LocalProduct localProduct) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(localProduct);
    }

    @Override
    public void delete(Long id) {
        Session currentSession = entityManager.unwrap(Session.class);
        LocalProduct localProduct = currentSession.get(LocalProduct.class, id);
        currentSession.delete(localProduct);
    }
}
