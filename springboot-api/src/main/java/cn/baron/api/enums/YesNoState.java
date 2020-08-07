package cn.baron.api.enums;

/**
 * 开关状态
 * 
 * @author Baron
 * @date 2020/08/07
 */
public enum YesNoState {
	/** 关闭 */
	NO("0", "关"),
	/** 开启 */
	YES("1", "开");

	/**
	 * 状态
	 */
	private String state;
	/**
	 * 状态名称
	 */
	private String stateName;

	private YesNoState(String state, String stateName) {
		this.state = state;
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return state;
	}

	public String getState() {
		return state;
	}

	public String getStateName() {
		return stateName;
	}
}
