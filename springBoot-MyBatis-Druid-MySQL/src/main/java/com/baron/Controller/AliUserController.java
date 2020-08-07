package com.baron.Controller;


import com.baron.service.AliOrderServiceImpl;
import com.baron.service.AliUserServiceImpl;
import com.baron.vo.AliOrder;
import com.baron.vo.AliUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Baron
 * @date 2020/7/24 10:46
 */
@RestController
@RequestMapping("/user")
public class AliUserController {

    @Autowired
    private AliUserServiceImpl aliUserService;

    @Autowired
    private AliOrderServiceImpl aliOrderService;

    @ResponseBody
    @RequestMapping("/selectAll")
    public List<AliUser> lists(){
        return aliUserService.selectUsers();
    }

    @ResponseBody
    @RequestMapping("/addOrder")
    public Integer addOrder(AliOrder aliOrder){
        return aliOrderService.insertOrder(aliOrder);
    }
}
