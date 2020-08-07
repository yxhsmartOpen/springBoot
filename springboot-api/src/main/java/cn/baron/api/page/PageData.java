package cn.baron.api.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Baron
 * @date 2020/08/08
 * @param <T>
 */
public class PageData<T> implements Serializable {

	/** 字段serialVersionUID */
	private static final long serialVersionUID = 6875343125740181423L;

	/** 总记录数 */
	private final long total;

	/** 分页条件 */
	private final PageableBean pageableBean;

	/** 内容 */
	private final List<T> content = new ArrayList<T>();

	/**
	 * 构造函数
	 * 
	 * @param content  the content of this page, must not be {@literal null}.
	 * @param pageReq  the paging information, can be {@literal null}.
	 * @param total  the total amount of items available
	 */
	public PageData(List<T> content, PageReq pageReq, long total) {
		if (null == content) {
			content = new ArrayList<T>();
		}
		if (total < content.size()) {
			throw new IllegalArgumentException("Total must not be less than the number of elements given!");
		}
		this.content.addAll(content);
		this.total = total;
		this.pageableBean = new PageableBean(pageReq.getPage(), pageReq.getSize(), pageReq.getOrderFields());
	}

	/**
	 * 构造函数
	 * 
	 * @param content  the content of this page, must not be {@literal null}.
	 * @param pageable  the paging information, can be {@literal null}.
	 * @param total  the total amount of items available
	 */
	public PageData(List<T> content, PageableBean pageable, long total) {
		if (null == content) {
			content = new ArrayList<T>();
		}
		if (total < content.size()) {
			throw new IllegalArgumentException("Total must not be less than the number of elements given!");
		}
		this.content.addAll(content);
		this.total = total;
		this.pageableBean = pageable;
	}

	/**
	 * Returns the number of the current . Is always non-negative.
	 * 
	 * @return the number of the current .
	 */
	public int getNumber() {
		return pageableBean == null ? 0 : pageableBean.getPageNumber();
	}

	/**
	 * Returns the size of the .
	 * 
	 * @return the size of the .
	 */
	public int getSize() {
		return pageableBean == null ? 0 : pageableBean.getPageSize();
	}

	/**
	 * Returns the number of elements currently on this .
	 * 
	 * @return the number of elements currently on this .
	 */
	public int getNumberOfElements() {
		return content.size();
	}

	/**
	 * Returns if there is a previous .
	 * 
	 * @return if there is a previous .
	 */
	public boolean hasPrevious() {
		return getNumber() > 1;
	}

	/**
	 * Returns whether the current is the first one.
	 * 
	 * @return
	 */
	public boolean isFirst() {
		return !hasPrevious();
	}

	/**
	 * Returns whether the current is the last one.
	 * 
	 * @return
	 */
	public boolean isLast() {
		return !hasNext();
	}

	/**
	 * Returns whether the has content at all.
	 * 
	 * @return
	 */
	public boolean hasContent() {
		return !content.isEmpty();
	}

	/**
	 * Returns the page content as {@link List}.
	 * 
	 * @return
	 */
	public List<T> getContent() {
		return Collections.unmodifiableList(content);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	public Iterator<T> iterator() {
		return content.iterator();
	}

	/**
	 * Returns the number of total pages.
	 * 
	 * @return the number of toral pages
	 */
	public int getTotalPages() {
		return getSize() == 0 ? 1 : (int) Math.ceil((double) total / (double) getSize());
	}

	/**
	 * Returns the total amount of elements.
	 * 
	 * @return the total amount of elements
	 */
	public long getTotalElements() {
		return total;
	}

	/**
	 * Returns if there is a next .
	 * 
	 * @return if there is a next .
	 */
	public boolean hasNext() {
		return getNumber() < getTotalPages();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		String contentType = "UNKNOWN";
		List<T> content = getContent();

		if (content.size() > 0) {
			contentType = content.get(0).getClass().getName();
		}

		return String.format("Page %s of %d containing %s instances", getNumber(), getTotalPages(), contentType);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PageData<?>)) {
			return false;
		}

		PageData<?> that = (PageData<?>) obj;

		return this.total == that.total && super.equals(obj);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {

		int result = 17;

		result += 31 * (int) (total ^ total >>> 32);
		result += 31 * super.hashCode();

		return result;
	}

}
