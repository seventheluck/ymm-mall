package com.yangmama.mall.service.impl;

import com.yangmama.mall.dao.LocalOrderDao;
import com.yangmama.mall.dao.LocalOrderLocalProductDao;
import com.yangmama.mall.model.LocalOrder;
import com.yangmama.mall.model.LocalOrderLocalProduct;
import com.yangmama.mall.service.CombinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class CombinationServiceImpl implements CombinationService {
    @Autowired
    LocalOrderDao localOrderDao;

    @Autowired
    LocalOrderLocalProductDao localOrderLocalProductDao;

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void combineOrders(String mainOrderDisplayId, List<String> subordinateOrderDisplayIds) throws Exception {
        LocalOrder mainOrder = localOrderDao.getByDisplayid(mainOrderDisplayId);
        if (mainOrder == null || !"open".equals(mainOrder.getStatus())) {
            throw new Exception("No such main order id");
        }

        StringBuilder sysNote = new StringBuilder();
        sysNote.append("Combine from: ");
        Set<LocalOrderLocalProduct> mainSet = mainOrder.getLocalOrderLocalProducts();
        Map<Long, LocalOrderLocalProduct> mainMap = new HashMap<>();

        for (String displayId : subordinateOrderDisplayIds) {
            LocalOrder subordinateOrder = localOrderDao.getByDisplayid(displayId);
            if (!"open".equals(subordinateOrder.getStatus())) {
                continue;
            }
            sysNote.append(displayId).append(" ");
            subordinateOrder.setStatus("close");
            subordinateOrder.setSysNote("Combin to " + mainOrderDisplayId);
            for (LocalOrderLocalProduct relation : mainSet) {
                mainMap.put(relation.getLocalProduct().getId(), relation);
            }

            for (LocalOrderLocalProduct relation : subordinateOrder.getLocalOrderLocalProducts()) {
                Long productId = relation.getLocalProduct().getId();
                if (mainMap.containsKey(productId)) {
                    LocalOrderLocalProduct localOrderLocalProduct = mainMap.get(productId);
                    localOrderLocalProduct.setQuantity(localOrderLocalProduct.getQuantity() + relation.getQuantity());
                } else {
                    LocalOrderLocalProduct localOrderLocalProduct = LocalOrderLocalProduct.builder()
                            .localProduct(relation.getLocalProduct())
                            .localOrder(mainOrder)
                            .price(relation.getPrice())
                            .quantity(relation.getQuantity())
                            .status(relation.getStatus())
                            .createdAt(relation.getCreatedAt())
                            .build();
                    mainMap.put(productId, localOrderLocalProduct);
                }
            }

            localOrderDao.save(subordinateOrder);
        }

        for (LocalOrderLocalProduct localOrderLocalProduct : mainMap.values()) {
            mainOrder.getLocalOrderLocalProducts().add(localOrderLocalProduct);
            localOrderLocalProduct.setLocalOrder(mainOrder);
            localOrderLocalProductDao.save(localOrderLocalProduct);
        }
        mainOrder.setSysNote(sysNote.toString());
        localOrderDao.save(mainOrder);
    }
}
