package cn.baron.api.page;

import java.io.Serializable;
import java.util.Collection;

/**
 * 分页返回数据类 用于datatables组件
 * 
 * @author macong
 *
 *         日期：2015年11月30日
 */
public class PageRsp<T> implements Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	/** 总记录 */
	private long recordsTotal;
	/** 过滤后的数据数 */
	private long recordsFiltered;
	/** 记录集 */
	private Collection<T> data;

	public PageRsp() {
	}

	public PageRsp(long recordsTotal, long recordsFiltered, Collection<T> data) {
		this.recordsTotal = recordsTotal;
		this.recordsFiltered = recordsFiltered;
		this.data = data;
	}

	public long getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public long getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public Collection<T> getData() {
		return data;
	}

	public void setData(Collection<T> data) {
		this.data = data;
	}

}
