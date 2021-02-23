package cn.baron.api.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Dsecription 提供分页辅助bean
 * @author Baron
 * @date 2020/08/08
 */
public class PageableBean implements Serializable {

	/** 字段serialVersionUID */
	private static final long serialVersionUID = -9206724112818089012L;

	private final int page;
	private final int size;
	/** 起始行 */
	private int startRow = -1;
	/** 结束行 */
	private int endRow = -1;
	private final List<OrderField> orderFields = new ArrayList<OrderField>();


	/**
	 * 分页构造函数
	 * 
	 * @param page must not be less than zero.
	 * @param size must not be less than one.
	 */
	public PageableBean(int page, int size) {

		this.page = page;
		this.size = size;
		initStartRow();
	}

	/**
	 * 分页构造函数
	 * 
	 * @param page one-based page index.
	 * @param size the size of the page to be returned.
	 * @param
	 */
	public PageableBean(int page, int size, List<OrderField> orderFields) {
		this(page, size);
		if (null != orderFields) {
			this.orderFields.addAll(orderFields);
		}
	}

	/**
	 * Returns the number of items to be returned.
	 * 
	 * @return the number of items of that page
	 */
	public int getPageSize() {
		return size;
	}

	/**
	 * Returns the page to be returned.
	 * 
	 * @return the page to be returned.
	 */
	public int getPageNumber() {
		return page;
	}

	/**
	 * Returns the offset to be taken according to the underlying page and page size.
	 * 
	 * @return the offset to be taken
	 */
	public int getOffset() {
		return page * size;
	}

	/**
	 * Returns whether there's a previous .we can access from the current one. Will return {@literal false} in case the current already refers to the first page.
	 * 
	 * @return
	 */
	public boolean hasPrevious() {
		return page > 1;
	}

	/**
	 * Returns the sorting parameters.
	 * 
	 * @return
	 */
	public List<OrderField> getOrderFields() {
		return orderFields;
	}

	/**
	 * 计算起始行
	 */
	private void initStartRow() {
		if (this.page > 0) {
			this.startRow = (page - 1) * this.size;
			this.endRow = this.startRow + this.size;
		}
	}

	public int getPage() {
		return page;
	}

	public int getSize() {
		return size;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getEndRow() {
		return endRow;
	}

}
