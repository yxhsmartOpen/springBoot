package com.baron.dao;


import com.baron.vo.AliOrder;
import com.baron.vo.AliUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Baron
 * @date 2020/7/24 9:32
 */
@Mapper
public interface Dao {

    List<AliUser> selectUsers();

    Integer insertOrder(AliOrder aliOrder);
}
