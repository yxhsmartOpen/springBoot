package com.baron.springmongo;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * @author yangxuanhua
 * @since v1.0
 */
public interface IMongoDBService {
    <T> T findById(Class<T> entityClass,String id);

    <T> List<T> findAll(Class<T> entityClass);

    void remove(Object obj);

    void add(Object obj);

    void saveOrUpdate(Object obj);

    <T> Long count(Class<T> entityClass, Query query);

    <T> List<T> findByQuery(Class<T> entityClass, Query query, Page page);

}
