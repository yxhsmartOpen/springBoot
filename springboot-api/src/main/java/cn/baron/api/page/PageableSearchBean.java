package cn.baron.api.page;

import java.io.Serializable;
import java.util.List;

/**
 * @Dsecription 提供分页辅助bean
 * @author macong
 *         日期：2015年8月30日
 */
public class PageableSearchBean extends PageableBean implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = -4401946541025693065L;

	/** 模糊查询对象 */
	private String search;

	public PageableSearchBean(int page, int size, List<OrderField> orderFields, String search) {
		super(page, size, orderFields);
		this.search = search;
	}

	public PageableSearchBean(int page, int size, List<OrderField> orderFields) {
		super(page, size, orderFields);
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}
