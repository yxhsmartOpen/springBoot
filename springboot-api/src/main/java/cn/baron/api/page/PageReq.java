package cn.baron.api.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页请求类 用于datatables组件
 * 
 * @author Baron
 * @date 2020/08/08
 */
public class PageReq implements Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	/** 记录开始行 */
	private int start;
	/** 每页显示多少行 */
	private int size = 15;
	/** 模糊过滤值 */
	private String search;
    /** 排序字段 */
	private String dirs;
	/** 排序字段 */
	private List<OrderField> orderFields;

	/**
	 * 获取当前是第几页
	 * 
	 * @return
	 */
	public int getPage() {
		if (0 == size) {
			return 1;
		} else {
			return start / size + 1;
		}
	}

	/**
	 * 根据page，size，排序重置参数
	 * 
	 * @param page 从1开始
	 * @param size 每页显示多少条数据
	 * @param orderFields
	 */
	public void resetParms(int page, int size, List<OrderField> orderFields) {
		this.start = Math.max(page - 1, 0) * size;
		this.size = size;
		this.orderFields = orderFields;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	/**
	 * 获取排序字段
	 * 
	 * @return
	 */
	public List<OrderField> getOrderFields() {
		if (null == this.orderFields && null != this.dirs) {
			orderFields = new ArrayList<OrderField>();
			String[] tmps = this.dirs.split(",");
			for (String orderStr : tmps) {
				String fieldName = null;
				String order = null;
				if (orderStr.startsWith("+")) {
					fieldName = orderStr.substring(1);
					order = OrderField.ASC;
				} else if (orderStr.startsWith("-")) {
					fieldName = orderStr.substring(1);
					order = OrderField.DESC;
				} else {
					String[] ords = orderStr.split("[|:]");
					if (ords.length != 2) {
						continue;
					}
					fieldName = ords[0];
					order = ords[1];
					// orders.add(new OrderField(ords[0],
					// ords[1]).underlineFlag(underlineFlag));
				}
				orderFields.add(new OrderField(fieldName, order));
			}
		}
		return orderFields;
	}

	public void setOrderFields(List<OrderField> orderFields) {
		this.orderFields = orderFields;
	}


	public String getDirs() {
		return dirs;
	}

	public void setDirs(String dirs) {
		this.dirs = dirs;
	}

	/**
	 * 获取起始行 数据库查询会用到
	 * 
	 * @return
	 */
	public int getStartRow() {
		return getStart();
	}

	/**
	 * 获取结束行 数据库查询会用到
	 * 
	 * @return
	 */
	public int getEndRow() {
		return getStart() + this.size;
	}

}
