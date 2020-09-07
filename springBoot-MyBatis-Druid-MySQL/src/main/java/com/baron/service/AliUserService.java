package com.baron.service;


import com.baron.vo.AliUser;

import java.util.List;

/**
 * @author Baron
 * @date 2020/7/24 17:20
 */
public interface AliUserService {

     List<AliUser> selectPageUsers(int pageNum,int pageSize);

     List<AliUser> selectUserByName(String userName);

     List<AliUser> selectUserById(String userId);

     Integer delete(String userId);
}
