package com.baron.service;


import com.baron.dao.Dao;
import com.baron.vo.AliUser;
import com.github.pagehelper.PageHelper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Baron
 * @date 2020/7/24 9:52
 */
@Service
@CacheConfig(cacheNames = "AliUserCache")
public class AliUserServiceImpl implements AliUserService {

    @Resource
    private Dao dao;

    @Override
    public List<AliUser> selectPageUsers(int pageNum,int pageSize) {

        /**
         * 在你需要进行分页的 MyBatis 查询方法前调用 PageHelper.startPage 静态方法即可，紧跟在这个方法后的第一个MyBatis 查询方法会被进行分页。
         */
        PageHelper.startPage(pageNum,pageSize);
        return dao.selectUsers();
    }

    @Cacheable
    @Override
    public List<AliUser> selectUserByName(String userName) { return dao.selectUserByName(userName);}

    @Cacheable
    @Override
    public List<AliUser> selectUserById(String userId) { return dao.selectUserById(userId);}

}
