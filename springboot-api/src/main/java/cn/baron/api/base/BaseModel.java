package cn.baron.api.base;

import java.io.Serializable;
import java.util.Date;

/**
 * @Dsecription  基础模型
 * @author  Baron
 * @date 2020/08/07
 */
public abstract class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	// 是/否
	public static final String YES = "1";

	public static final String NO = "0";

	// 删除标记（0：正常；1：删除；；）
	public static final String DEL_FLAG = "delFlag";

	public static final String DEL_FLAG_NORMAL = "0";

	public static final String DEL_FLAG_DELETE = "1";

	/** id */
	protected String id;

	/** 创建时间 */
	private Date createDate;
	/** 修改时间 用于增量操作 */
	private Date updateDate;
	/** 删除标记（0：正常；1：删除；）*/
	protected String delFlag; 

	/**
	 * 构造函数
	 */
	public BaseModel() {
		super();
		this.delFlag = DEL_FLAG_NORMAL;
	}

	/**
	 * 新增之前
	 */
	public void prePersist() {
		this.createDate = new Date();
		this.updateDate = this.createDate;
	}

	/**
	 * 修改之前
	 */
	public void preUpdate() {
		this.updateDate = new Date();
	}

	/**
	 * 
	 * @return xx
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * 
	 * @param createDate xx
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 
	 * @return xx
	 */
	public String getDelFlag() {
		return delFlag;
	}

	/**
	 * 
	 * @param delFlag xx
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
