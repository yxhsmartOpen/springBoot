package com.baron.springboot.http.isp;

import java.util.List;

/**
 * 5g下行接口返回
 * @author yangxuanhua
 * @since v1.0
 */
public class FiveGMtReturnVo {
    /**状态码*/
    private String code;
    /**描述*/
    private String desc;
    /**下行接口返回集合*/
    private List<FiveGMtReturn> list;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<FiveGMtReturn> getList() {
        return list;
    }

    public void setList(List<FiveGMtReturn> list) {
        this.list = list;
    }
}
