package com.baron.Controller;

import com.baron.service.AliOrderService;
import com.baron.vo.AliOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Baron
 * @date 2020/8/9 22:11
 */
@RestController
@RequestMapping("/order")
public class AliOrderController {
    @Autowired
    private AliOrderService aliOrderService;

    @ResponseBody
    @RequestMapping("/addOrder")
    public Integer addOrder(AliOrder aliOrder){
        return aliOrderService.insertOrder(aliOrder);
    }
}
