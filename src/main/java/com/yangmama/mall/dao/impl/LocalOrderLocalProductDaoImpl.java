package com.yangmama.mall.dao.impl;

import com.yangmama.mall.dao.LocalOrderLocalProductDao;
import com.yangmama.mall.model.LocalOrderLocalProduct;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class LocalOrderLocalProductDaoImpl implements LocalOrderLocalProductDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public void save(LocalOrderLocalProduct localOrderLocalProduct) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(localOrderLocalProduct);
    }

    @Override
    public void delete(Long id) {
        Session currentSession = entityManager.unwrap(Session.class);
        LocalOrderLocalProduct localOrderLocalProduct = currentSession.get(LocalOrderLocalProduct.class, id);
        currentSession.delete(localOrderLocalProduct);
    }
}
