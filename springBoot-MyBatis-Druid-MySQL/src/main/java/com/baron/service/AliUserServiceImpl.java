package com.baron.service;



import com.baron.dao.Dao;
import com.baron.vo.AliUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Baron
 * @date 2020/7/24 9:52
 */
@Service
public class AliUserServiceImpl implements AliUserService {

    @Resource
    private Dao dao;

    @Override
    public List<AliUser> selectUsers() {
        return dao.selectUsers();
    }

}
