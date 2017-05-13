package com.ornament.dao;

import com.ornament.domain.Collection;
import com.ornament.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by chenshuguo on 2017/5/9.
 */
public interface CollectionDao {

    /**
     *
     * @param collection
     * @return
     */
    public Integer createCollection(@Param("collection")Collection collection);
}
