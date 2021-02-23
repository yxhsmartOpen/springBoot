package cn.baron.api.page;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Dsecription 排序字段
 * @author Baron
 * @date 2020/08/08
 */
public class OrderField implements Serializable {
	/** 字段serialVersionUID */
	private static final long serialVersionUID = 5363359835416617843L;

	/** sql注入正则 */
	private static final Pattern SQL_ILLEGAL_PATTERN = Pattern.compile("[\\s\\(\\)',]");

	/** 倒序 */
	public static final String DESC = "DESC";
	/** 倒序 */
	public static final String DESC_NULLS_FIRST = "DESC NULLS FIRST";
	/** 倒序 */
	public static final String DESC_NULLS_LAST = "DESC NULLS LAST";
	/** 正序 */
	public static final String ASC = "ASC";
	/** 正序 */
	public static final String ASC_NULLS_FIRST = "ASC NULLS FIRST";
	/** 正序 */
	public static final String ASC_NULLS_LAST = "ASC NULLS LAST";

	private static final Set<String> ORDER_SET = new HashSet<>(6);
	static {
		ORDER_SET.add(DESC);
		ORDER_SET.add(DESC_NULLS_FIRST);
		ORDER_SET.add(DESC_NULLS_LAST);
		ORDER_SET.add(ASC);
		ORDER_SET.add(ASC_NULLS_FIRST);
		ORDER_SET.add(ASC_NULLS_LAST);
	}

	public OrderField() {
	}

	public OrderField(String fieldName, String order) {
		this.setFieldName(fieldName);
		this.setOrder(order);
	}

	private String fieldName;
	private String order;
	/** 默认为下划线方式 */
	private boolean underlineFlag;

	public String getFieldName() {
		if (null != fieldName && underlineFlag) {
			return camelToUnderline(fieldName);
		} else {
			return fieldName;
		}
	}

	public OrderField setFieldName(String fieldName) {
		//安全监测 防止sql注入
		if (null == fieldName || match(fieldName, SQL_ILLEGAL_PATTERN)) {
			throw new IllegalArgumentException("非法的fieldName：" + fieldName);
		}
		this.fieldName = fieldName;
		return this;
	}

	public OrderField setOrder(String order) {
		//安全监测 防止sql注入
		if (null == order) {
			order = ASC;
		}
		order = order.toUpperCase();
		if (!ORDER_SET.contains(order)) {
			throw new IllegalArgumentException("非法的order：" + order);
		}
		this.order = order;
		return this;
	}

	/**
	 * 设置是否保持驼峰方式
	 *
	 * @param underlineFlag
	 * @return
	 */
	public OrderField underlineFlag(boolean underlineFlag) {
		this.underlineFlag = underlineFlag;
		return this;
	}

	public String getOrder() {
		return order;
	}

	/**
	 * 驼峰转下划线
	 * @param param
	 * @return
	 */
	private static String camelToUnderline(String param) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		int len = param.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			char c = param.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append("_");
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	/**
	 * 是否match
	 * 
	 * @param source 要匹配的源文本
	 * @param pattern pattern
	 * @return 属性值列表
	 */
	private static boolean match(String source, Pattern pattern) {
		if (null == source) {
			return false;
		}
		Matcher m = pattern.matcher(source);
		if (m.find()) {
			return true;
		}
		return false;
	}
}
