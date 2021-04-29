package com.baron.springboot.http.isp;

/**
 * @author yangxuanhua
 * @since v1.0
 */
public class FiveGMt {
    /**目的手机号，此处不支持同时传多手机号*/
    private String toMobile;
    /**短信内容(只支持GBK的URL转码,若使用其它编码需要转换一下)*/
    private String content;
    /**I5G短信模板ID，必填项，其值来源于MAAS运营平台。*/
    private String templateId;
    /**指定I5G短信模板中的标题（指的是单卡片或者多卡片第一个卡片的标题内容），如不传值则以模板中的标题为准，该字段不算入短信计费长度（不可超出25字）*/
    private String title;
    /**指定I5G短信模板中的摘要内容（指的是单卡片或者多卡片第一个卡片的摘要内容），如不传值则以模板中的摘要为准，该字段不算入短信计费长度（不可超出1000字）。*/
    private String abstractContent;
    /**指定i5G短信模板中，指定别名变量的具体参数值，其内容为固定的按照JSONObject方式解析的JSON串，详细使用说明可参看4.5章节*/
    private String tabContent;

    public String getToMobile() {
        return toMobile;
    }

    public void setToMobile(String toMobile) {
        this.toMobile = toMobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractContent() {
        return abstractContent;
    }

    public void setAbstractContent(String abstractContent) {
        this.abstractContent = abstractContent;
    }

    public String getTabContent() {
        return tabContent;
    }

    public void setTabContent(String tabContent) {
        this.tabContent = tabContent;
    }

}
