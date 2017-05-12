package com.ornament.service;

import com.ornament.domain.Collection;
import org.springframework.stereotype.Service;

/**
 * Created by chenshuguo on 2017/5/9.
 */
@Service
public interface CollectionService {
    Integer createCollection(Collection collection);
}
