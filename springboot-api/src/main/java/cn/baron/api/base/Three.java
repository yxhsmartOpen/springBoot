package cn.baron.api.base;

import java.io.Serializable;

/**
 * 键值对
 *
 * @author Baron
 * @date 2020/08/08
 * @param <A>
 * @param <B>
 * @param <C>
 */
public class Three<A, B, C> implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	public A first;

	public B second;

	public C third;

	/**
	 * 构造函数
	 */
	public Three() {
	}

	/**
	 * 构造函数
	 * 
	 * @param first
	 * @param second
	 */
	public Three(A first, B second, C third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public A getFirst() {
		return first;
	}

	public void setFirst(A first) {
		this.first = first;
	}

	public B getSecond() {
		return second;
	}

	public void setSecond(B second) {
		this.second = second;
	}

	public C getThird() {
		return third;
	}

	public void setThird(C third) {
		this.third = third;
	}

}
