package com.baron.Controller;


import com.alibaba.druid.stat.DruidStatManagerFacade;
import com.baron.service.AliOrderService;
import com.baron.service.AliUserService;
import com.baron.vo.AliOrder;
import com.baron.vo.AliUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    private AliUserService aliUserService;

    @Autowired
    private AliOrderService aliOrderService;

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

    @ResponseBody
    @GetMapping("/druid-stat")
    public Object getDruidStatData(){
        // DruidStatManagerFacade#getDataSourceStatDataList 该方法可以获取所有数据源的监控数据
        // 除此之外 DruidStatManagerFacade 还提供了一些其他方法，我们可以按需选择使用。
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}
