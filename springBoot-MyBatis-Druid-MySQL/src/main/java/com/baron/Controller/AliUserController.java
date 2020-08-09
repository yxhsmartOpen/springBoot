package com.baron.Controller;


import com.alibaba.druid.stat.DruidStatManagerFacade;
import com.baron.service.AliUserService;
import com.baron.vo.AliUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @ResponseBody
    @RequestMapping("/selectAll")
    public List<AliUser> lists(@RequestParam int pageNum,@RequestParam int pageSize){
        // 查询分页用户
        return aliUserService.selectPageUsers(pageNum,pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/selectUserByName",method = RequestMethod.GET)
    public List<AliUser> selectUserByName(@RequestParam String userName){return aliUserService.selectUserByName(userName); }

    @ResponseBody
    @RequestMapping(value = "/selectUserById",method = RequestMethod.GET)
    public List<AliUser> selectUserById(@RequestParam String userId){return aliUserService.selectUserById(userId); }

    @ResponseBody
    @GetMapping("/druid-stat")
    public Object getDruidStatData(){
        // DruidStatManagerFacade#getDataSourceStatDataList 该方法可以获取所有数据源的监控数据
        // 除此之外 DruidStatManagerFacade 还提供了一些其他方法，我们可以按需选择使用。
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}
