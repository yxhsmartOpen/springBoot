package com.baron.springboot.http.isp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yangxuanhua
 * @since v1.0
 */
@Controller
@RequestMapping("/isp")
@Slf4j
public class IspController {

    @RequestMapping("/test1")
    public void test1(HttpServletRequest request, HttpServletResponse response){

    }
}
