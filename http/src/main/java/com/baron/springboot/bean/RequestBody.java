package com.baron.springboot.bean;

public class RequestBody {
    private String omsCode;

    private Integer typeId;
    private Integer page;
    private Integer limit;

    private Integer id;

    public String getOmsCode() {
        return omsCode;
    }

    public void setOmsCode(String omsCode) {
        this.omsCode = omsCode;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
