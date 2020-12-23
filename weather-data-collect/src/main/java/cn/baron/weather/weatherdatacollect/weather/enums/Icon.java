package cn.baron.weather.weatherdatacollect.weather.enums;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 天气状况代码和图标枚举类
 * 设计图片时按照重点来划分，比如，小到中雨，倾向的是中雨，中到大雨，倾向的是大雨。。。。。。。。。。。。
 * 
 * @author Baron
 * @date 2017年3月30日 下午4:46:28
 */
public enum Icon {
	/* 晴* */
	QING("100", "晴", "http://files.heweather.com/cond_icon/100.png"),
	/* 多云* */
	DUO_YUN("101", "多云,阴~多云,多云转阴,多云~阴,阴转多云", "http://files.heweather.com/cond_icon/101.png"),
	/* 晴间多云* */
	QING_JIAN_DUO_YUN("103", "晴间多云,晴转多云,晴~多云,多云~晴,少云", "http://files.heweather.com/cond_icon/103.png"),
	/* 阴* */
	YIN("104", "阴", "http://files.heweather.com/cond_icon/104.png"),
	/* 以小雨为主* */
	DUO_YUN_XIAO_YU("134", "多云~小雨,小雨~多云,阴~小雨,小雨~阴,小雨,小雨~晴", ""),
	/* 按风力级别的大小划分等级* */
	HE_FENG("203", "和风,清风,微风,有风,平静", "http://files.heweather.com/cond_icon/203.png"),
	/* 按风力级别划分* */
	DA_FENG("207", "大风,疾风,强风/劲风", "http://files.heweather.com/cond_icon/207.png"),
	/* 强调风力强度级别为风暴* */
	FENG_BAO("209", "风暴,烈风,狂爆风,飓风,龙卷风,热带风暴", "http://files.heweather.com/cond_icon/209.png"),
	/* 以阵雨为主* */
	ZHEN_YU("300", "阵雨,阴~阵雨,阴转阵雨,阵雨~小雨,中雨~阵雨,阵雨~阴,阵雨~多云,阵雨~中雨,多云~阵雨", "http://files.heweather.com/cond_icon/300.png"),
	/* 雷阵雨伴有冰雹* */
	LEI_ZHEN_YU_BIN_BAO("304", "雷阵雨伴有冰雹", "http://files.heweather.com/cond_icon/304.png"),
	/* 毛毛雨/细雨* */
	XI_YU("309", "毛毛雨/细雨", "http://files.heweather.com/cond_icon/309.png"),
	/* 特大暴雨* */
	TE_DA_BAO_YU("312", "特大暴雨,大到暴雨~阵雨,极端降雨,暴雨~大雨,暴雨,大到暴雨~小雨,大暴雨", "http://files.heweather.com/cond_icon/312.png"),
	/* 冻雨* */
	DONG_YU("313", "冻雨", "http://files.heweather.com/cond_icon/313.png"),
	/* 强调 小雨~大雨 的这个过程* */
	XIAO_YU_DA_YU("319", "小雨~大雨,中到大雨,中雨~大雨,中到大雨~中雨,大雨", "http://files.heweather.com/cond_icon/305.png"),
	/* 小到中雨~中雨* */
	XIAO_YU_ZHONG_ZHONG_YU("326", "小到中雨~中雨,小到中雨~多云,小到中雨~小雨,中雨~小雨,小雨~中雨,中雨,多云~中雨", ""),
	/* 雷阵雨~阵雨* */
	LEI_ZHEN_YU_ZHEN_YU("342", "强雷阵雨,雷阵雨,强阵雨,雷阵雨~阵雨,雷阵雨~中雨,雷阵雨~多云,大雨~雷阵雨,暴雨~雷阵雨,中雨~雷阵雨,雷阵雨~阴", "http://files.heweather.com/cond_icon/302.png"),
	/* 中雨~小到中雨* */
	ZHONG_YU_XIAO_ZHONG_YU("357", "中雨~小到中雨,阵雨~小到中雨,小到中雨~中到大雨,小雨~小到中雨", "http://files.heweather.com/cond_icon/305.png"),
	/* 小雪* */
	XIAO_XUE("400", "小雪,小雪~阴,小雪~多云", "http://files.heweather.com/cond_icon/400.png"),
	/* 中雪* */
	ZHONG_XUE("401", "中雪,中雪~小雪", "http://files.heweather.com/cond_icon/401.png"),
	/* 大雪* */
	DA_XUE("402", "大雪,多云~中到大雪", "http://files.heweather.com/cond_icon/402.png"),
	/* 暴雪* */
	BAO_XUE("403", "暴雪,阵雪", "http://files.heweather.com/cond_icon/403.png"),
	/* 雨夹雪* */
	YU_JIA_XUE("404", "雨夹雪,小雪~雨夹雪,雨夹雪~多云,小雨~雨夹雪,雨雪天气,阴~雨夹雪,阵雨夹雪", "http://files.heweather.com/cond_icon/404.png"),
	/* 雾* */
	WU("501", "雾,薄雾,大雾", "http://files.heweather.com/cond_icon/501.png"),
	/* 晴* */
	MAI("502", "霾,霾~晴", "http://files.heweather.com/cond_icon/502.png"),
	/* 扬沙* */
	YANG_SHA("503", "扬沙,浮尘", "http://files.heweather.com/cond_icon/503.png"),
	/* 强沙尘暴* */
	QIANG_SHA_CHEN_BAO("508", "强沙尘暴,沙尘暴", "http://files.heweather.com/cond_icon/508.png"),
	/* 热* */
	RE("900", "热", "http://files.heweather.com/cond_icon/900.png"),
	/* 冷* */
	LENG("901", "冷", "http://files.heweather.com/cond_icon/901.png"),
	/* 未知* */
	WEI_ZHI("999", "未知", "http://files.heweather.com/cond_icon/999.png"),
	/******************** 以下配置是根据中文名称找不到相应的枚举，只要中文名称包含雨、雪、雾、霾或者雷和闪电.....，就算找到对应的枚举 ******/
	/* 雨夹雪、有雪或有雨的天气,寒风呼呼* */
	YOU_XUE("1001", "雨夹雪、有雪或有雨的天气,寒风呼呼", "http://files.heweather.com/cond_icon/999.png"),
	/* 有雾或霾的天气* */
	YOU_WU("1002", "有雾或霾的天气", "http://files.heweather.com/cond_icon/999.png"),
	/* 有打雷或闪电，伴有大雨的天气* */
	YOU_LEI("1003", "有打雷或闪电,伴有大雨的天气", "http://files.heweather.com/cond_icon/999.png"),
	/* 多云间阴，偶尔有微风和太阳天天气* */
	YOU_YUN("1004", "多云间阴,偶尔有微风和太阳天天气", "http://files.heweather.com/cond_icon/999.png");
	/** 天气图标编号 */
	private String id;
	/** 中文名称 */
	private String chaName;
	/** 图片路劲 */
	private String picturePath;
	/** 字段map */
	private static Map<String, Icon> map;

	private Icon(String id, String chaName, String picturePath) {
		this.id = id;
		this.chaName = chaName;
		this.picturePath = picturePath;
		initMap(chaName, this);
	}

	@Override
	public String toString() {
		return picturePath;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChaName() {
		return chaName;
	}

	public void setChaName(String chaName) {
		this.chaName = chaName;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public static Icon getIcon(String chaName) {
		Collection<Icon> icons = map.values();
		for (Icon icon : icons) {
			if (icon.getChaName().contains(chaName)) {
				return map.get(icon.getChaName());
			}
		}
		return null;
	}

	/*
	 * public static Icon getIconByName(String chaName) { for (Icon icon :
	 * Icon.values()) { // if (chaName.equals(icon.getChaName())) { // return
	 * icon; // } if (icon.getChaName().contains(chaName)) { return icon; } }
	 * return null; }
	 */

	private void initMap(String chaName, Icon icon) {
		if (Icon.map == null) {
			Icon.map = new LinkedHashMap<String, Icon>();
		}
		Icon.map.put(chaName, icon);
	}

	public static Map<String, Icon> getIconMap() {
		return map;
	}

}
