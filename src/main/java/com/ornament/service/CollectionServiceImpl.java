package com.ornament.service;

import com.ornament.dao.CollectionDao;
import com.ornament.domain.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangxt25 on 2017/5/12.
 */
@Service
public class CollectionServiceImpl implements CollectionService {

    @Autowired
    CollectionDao collectionDao;

    public Integer createCollection(Collection collection) {
        return collectionDao.createCollection(collection);
    }
}
