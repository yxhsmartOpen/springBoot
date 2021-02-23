package cn.baron.api.enums;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Dsecription 设备类型大类枚举
 * @author Baron
 * @since 2020/08/07
 *
 */
public enum DeviceEnum {

	/** UNKNOWN */
	UNKNOWN("0", "未知"),
	/** MOBILE */
	MOBILE("1", "手机，android/ios"),
	/** PAD */
	PAD("2", "平板，android/ios"),
	/** COMPUTE */
	COMPUTE("3", "电脑");

	/** 登录类型 */
	private String type;

	/** 类型描述 */
	private String message;

	private static Map<String, DeviceEnum> map;

	private DeviceEnum(String type, String message) {
		this.type = type;
		this.message = message;
		initMap(type, this);
	}

	@Override
	public String toString() {
		return type;
	}

	public String getType() {
		return type;
	}

	public String getMessage() {
		return message;
	}

	public static DeviceEnum getLoginEnum(Integer code) {return DeviceEnum.map.get(code.toString());}

	private void initMap(String type, DeviceEnum elemEnum) {
		if (DeviceEnum.map == null) {
			DeviceEnum.map = new LinkedHashMap<String, DeviceEnum>();
		}

		DeviceEnum.map.put(type, elemEnum);
	}

	public static Map<String, DeviceEnum> getLoginEnum() {
		return map;
	}

}
