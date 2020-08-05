package com.baron.service;

import com.baron.dao.Dao;
import com.baron.vo.AliOrder;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Baron
 * @date 2020/7/24 9:52
 */
@Service
@Slf4j
public class AliOrderService implements AliOrderServiceImpl {

    private static Logger logger = LoggerFactory.getLogger(AliOrderService.class);

    @Resource
    private Dao dao;

    @Override
    public Integer insertOrder(AliOrder aliOrder) {

        aliOrder = aliOrder.toBuilder().
                userId(1).
                name("香蕉").
                createDate(new Date()).
                updateDate(new Date()).
                groupId(2).
                remarks("请不要将我的包括损坏！").
                orderDetail("1斤香蕉，顺丰速运！").
                status(1).
                build();

        logger.info("插入一条数据：{}",aliOrder);

        return dao.insertOrder(aliOrder);
    }
}
