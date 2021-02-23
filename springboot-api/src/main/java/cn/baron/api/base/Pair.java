package cn.baron.api.base;

import java.io.Serializable;

/**
 * @Dsecription 键值对
 * @author Baron
 * @date 2020/08/08
 * @param <A>
 * @param <B>
 */
public class Pair<A, B> implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	public A first;

	public B second;

	/**
	 * 构造函数
	 * 
	 */
	public Pair() {
	}

	/**
	 * 构造函数
	 * 
	 * @param first
	 * @param second
	 */
	public Pair(A first, B second) {
		this.first = first;
		this.second = second;
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

	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}

}
