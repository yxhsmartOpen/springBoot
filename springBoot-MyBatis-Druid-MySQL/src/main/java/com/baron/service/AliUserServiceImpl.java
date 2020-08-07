package com.baron.service;


import com.baron.vo.AliUser;

import java.util.List;

/**
 * @author Baron
 * @date 2020/7/24 17:20
 */
public interface AliUserServiceImpl {

     List<AliUser> selectUsers();
}
