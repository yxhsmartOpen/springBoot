package cn.baron.api.base;

import java.io.Serializable;

/**
 * @Dsecription 通用接口返回对象
 * @author Baron
 * @date 2020/08/08
 * @param <T>
 */
public class RstObj<T> implements Serializable {

	/** 字段serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** 状态码成功 */
	public final static int STATUS_CODE_SUCCESS = 200;

	/** 状态调用失败 */
	public final static int STATUS_CODE_FAILURE = 300;

	/** 状态调用警告 */
	public final static int STATUS_CODE_ALERT = 302;

	/** 需要登录 */
	public final static int STATUS_UNAUTHORIZED = 401;

	/** 需要强制修改密码 */
	public final static int STATUS_CODE_FORCE_UPDATEPWD = 402;

	/** 状态码禁止访问 */
	public final static int STATUS_CODE_FORBIDDEN = 403;

	/** 状态码未找到 */
	public final static int STATUS_CODE_NOTFOUND = 404;

	/** 状态码服务器端错误 */
	public final static int STATUS_CODE_SERVEERROR = 500;

	/** 返回状态 */
	private int state = STATUS_CODE_SUCCESS;

	/** 消息 */
	private String msg = "";

	/** 返回数据 */
	private T rst = null;

	/** 标识为从服务端返回了数据 */
	private String _mark = "_server_api";

	/**
	 * 生成成功对象
	 * 
	 * @return obj
	 */
	public static <T> RstObj<T> newOk() {
		return new RstObj<T>(STATUS_CODE_SUCCESS, "", null);
	}

	/**
	 * 生成成功对象
	 *
	 * @param rst
	 * @param <T>
	 * @return
	 */
	public static <T> RstObj<T> newOk(T rst) {
		return new RstObj<T>(STATUS_CODE_SUCCESS, "", rst);
	}

	/**
	 * 生成成功对象
	 * 
	 * @param msg msg
	 * @param rst rst
	 * @return obj
	 */
	public static <T> RstObj<T> newOk(String msg, T rst) {
		return new RstObj<T>(STATUS_CODE_SUCCESS, msg, rst);
	}

	/**
	 * 生成警告对象
	 * 
	 * @param msg msg
	 * @param rst rst
	 * @return obj
	 */
	public static <T> RstObj<T> newAlert(String msg, T rst) {
		return new RstObj<T>(STATUS_CODE_ALERT, msg, rst);
	}

	/**
	 * 生成警告对象
	 *
	 * @param msg
	 * @param <T>
	 * @return
	 */
	public static <T> RstObj<T> newAlert(String msg) {
		return new RstObj<T>(STATUS_CODE_ALERT, msg, null);
	}

	/**
	 * 生成错误对象
	 * 
	 * @param msg msg
	 * @return obj
	 */
	public static <T> RstObj<T> newError(String msg) {
		return new RstObj<T>(STATUS_CODE_FAILURE, msg);
	}

	/**
	 * 生成错误对象
	 * 
	 * @param msg msg
	 * @param rst rst
	 * @return obj
	 */
	public static <T> RstObj<T> newError(String msg, T rst) {
		return new RstObj<T>(STATUS_CODE_FAILURE, msg, rst);
	}

	/**
	 * 需要登录对象
	 * 
	 * @param msg msg
	 * @return obj
	 */
	public static <T> RstObj<T> newUnAuth(String msg) {
		return new RstObj<T>(STATUS_UNAUTHORIZED, msg);
	}

	/**
	 * 需要强制修改密码
	 * 
	 * @param msg msg
	 * @return obj
	 */
	public static <T> RstObj<T> newForceUpdatePwd(String msg) {
		return new RstObj<T>(STATUS_CODE_FORCE_UPDATEPWD, msg);
	}

	/**
	 * 生成禁止访问对象
	 * 
	 * @param msg msg
	 * @return obj
	 */
	public static <T> RstObj<T> newForbidden(String msg) {
		return new RstObj<T>(STATUS_CODE_FORBIDDEN, msg);
	}

	/**
	 * 生成禁止访问对象
	 * 
	 * @param msg msg
	 * @param rst rst
	 * @return obj
	 */
	public static <T> RstObj<T> newForbidden(String msg, T rst) {
		return new RstObj<T>(STATUS_CODE_FORBIDDEN, msg, rst);
	}

	/**
	 * 生成访问对象
	 * 
	 * @param state state
	 * @param msg msg
	 * @param rst rst
	 * @return obj
	 */
	public static <T> RstObj<T> newRstObj(int state, String msg, T rst) {
		return new RstObj<T>(state, msg, rst);
	}

	/**
	 * 生成访问对象
	 * 
	 * @param state state
	 * @param msg msg
	 * @return obj
	 */
	public static <T> RstObj<T> newRstObj(int state, String msg) {
		return new RstObj<T>(state, msg);
	}

	/**
	 * 是否成功
	 *
	 * @return obj
	 */
	public boolean successful() {
		return STATUS_CODE_SUCCESS == state;
	}

	/**
	 * 构造函数
	 */
	public RstObj() {
	}

	/**
	 * 构造函数
	 * 
	 * @param state state
	 */
	public RstObj(int state) {
		this.state = state;
	}

	/**
	 * 构造函数
	 * 
	 * @param state state
	 * @param msg msg
	 */
	public RstObj(int state, String msg) {
		this.state = state;
		this.msg = msg;
	}

	/**
	 * 构造函数
	 * 
	 * @param msg msg
	 * @param state state
	 * @param rst rst
	 */
	public RstObj(int state, String msg, T rst) {
		this.state = state;
		this.msg = msg;
		this.rst = rst;
	}

	/**
	 * @return state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state 要设置的 state
	 */
	public void setState(int state) {
		this.state = state;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getRst() {
		return rst;
	}

	public void setRst(T rst) {
		this.rst = rst;
	}

	public String get_mark() {
		return _mark;
	}

	public void set_mark(String _mark) {
		this._mark = _mark;
	}

	@Override
	public String toString() {
		return "RstObj [state=" + state + ", msg=" + msg + ", rst=" + rst + ", _mark=" + _mark + "]";
	}

}
