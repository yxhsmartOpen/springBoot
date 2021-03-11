package com.baron.springmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yangxuanhua
 * @since v1.0
 */
@Component
@Qualifier("IMongoDBService")
public class MongoDBServiceImpl implements IMongoDBService{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public <T> T findById(Class<T> entityClass , String id) {
        return this.mongoTemplate.findById ( id,entityClass );
    }

    @Override
    public <T> List<T> findAll(Class<T> entityClass) {
        return this.mongoTemplate.findAll ( entityClass );
    }

    @Override
    public void remove(Object obj) {
        this.mongoTemplate.remove ( obj );
    }

    @Override
    public void add(Object obj) {
        this.mongoTemplate.insert ( obj );
    }

    @Override
    public void saveOrUpdate(Object obj) {
        this.mongoTemplate.save ( obj );
    }

    @Override
    public <T> Long count(Class<T> entityClass , Query query) {
        return this.mongoTemplate.count ( query,entityClass );
    }

    @Override
    public <T> List<T> findByQuery(Class<T> entityClass , Query query , Page page) {
        Long count = this.count ( entityClass,query );
//        if(page != null){
//            page.setRecordCount ( count.intValue () );
//            int pageNumber = page.getCurrentPage ();
//            int pageSize = page.getPageSize ();
//            query.skip ( (pageNumber-1) * pageSize).limit ( pageSize );
//        }
        return this.mongoTemplate.find ( query.skip(1),entityClass );
    }
}
