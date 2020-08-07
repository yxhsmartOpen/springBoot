package cn.baron.api.enums;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 设备类型枚举
 * 
 * @author Baron
 * @since 2020/08/07
 *
 */
public enum DeviceType {
	/** 未知 */
	UNKNOWN("0", "未知"),
	/** 手机，android */
	MOBILE_ANDROID("1", "手机，android"),
	/** 手机，ios */
	MOBILE_IOS("2", "手机，ios"),
	/** 平板，android */
	PAD_ANDROID("3", "平板，android"),
	/** 平板，ios */
	PAD_IOS("4", "平板，ios"),
	/** 电脑pc */
	COMPUTE("5", "电脑pc");

	/** 登录类型 */
	private String type;

	/** 类型描述 */
	private String message;

	private static Map<String, DeviceType> map;

	private DeviceType(String type, String message) {
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

	public static DeviceType getDeviceType(String type) {
		return DeviceType.map.get(type);
	}

	private void initMap(String type, DeviceType elemEnum) {
		if (DeviceType.map == null) {
			DeviceType.map = new LinkedHashMap<String, DeviceType>();
		}
		DeviceType.map.put(type, elemEnum);
	}

	public static Map<String, DeviceType> getDeviceTypeMap() {
		return map;
	}

}
