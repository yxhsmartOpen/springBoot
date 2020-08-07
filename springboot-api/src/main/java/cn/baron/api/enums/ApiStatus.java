package cn.baron.api.enums;

/**
 * api响应状态枚举
 * 
 * @author Baron
 * @date 2020/08/07
 */
public enum ApiStatus {
	/** 成功 */
	SUCCESS(200, 200, "成功"),
	/** 失败 */
	ERROR(300, 200, "失败"),
	/** 警告 */
	ALERT(302, 200, "警告"),
	/** 需要验证码 */
	LIMIT_ERROR(303, 200, "需要验证码"),
	/** 用户锁定 */
	TOKEN_USER_LOCK(304, 401, "用户被锁定"),
	/** token非法或token过期，需要重新获取token */
	TOKEN_ILLEGAL(306, 401, "token非法或token过期，需要重新获取"),
	/** 客服端环境改变，需要重新获取token */
	CLIENT_CHANGED(307, 401, "客服端环境改变，需要重新获取token"),
	/** 未授权 */
	UN_AUTHORIZED(401, 401, "未授权"),
	/** 禁止访问 */
	FORBIDDEN(403, 403, "禁止访问"),
	/** 找不到访问的资源 */
	NOT_FOUND(404, 404, "找不到访问的资源"),
	/** open相关非法的accessKey */
	OPEN_ACCESSKEY_ILLEGAL(320, 200, "非法的accessKey"),
	/** open相关非法的签名 */
	OPEN_PARAMS_ILLEGAL(321, 200, "非法的api请求参数"),
	/** open相关非法的签名 */
	OPEN_SIGN_ILLEGAL(322, 200, "非法的签名"),
	/** open相关非法的签名 */
	OPEN_EXPIRES(323, 200, "请求已过期"),
	/** app版本错误 如果需要强制升级，且为post操作，则需要返回错误 */
	ERROR_VER(406, 406, "版本错误"),
	/** 服务端错误 */
	SERVEERROR(500, 500, "服务端错误");

	/** 状态 码 */
	private int code;
	/** http状态码 */
	private int httpCode;
	/** 状态名称 */
	private String name;

	 ApiStatus(int code, int httpCode, String name) {
		this.code = code;
		this.httpCode = httpCode;
		this.name = name;
	}

	@Override
	public String toString() {
		return code + "";
	}

	public int getCode() {
		return code;
	}

	public int getHttpCode() {
		return httpCode;
	}

	public String getName() {
		return name;
	}
}
