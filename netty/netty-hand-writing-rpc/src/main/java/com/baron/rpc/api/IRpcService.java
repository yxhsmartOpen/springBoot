package com.baron.rpc.api;

public interface IRpcService {

    /**
     * 加
     * @param a 参数一
     * @param b 参数二
     * @return 相加之后的结果
     */
    int add(int a, int b);

    /**
     * 加
     * @param a 参数一
     * @param b 参数二
     * @return 相减之后的结果
     */
    int sub(int a, int b);

    /**
     * 加
     * @param a 参数一
     * @param b 参数二
     * @return 相乘之后的结果
     */
    int mult(int a, int b);

    /**
     * 加
     * @param a 参数一
     * @param b 参数二
     * @return 相除之后的结果
     */
    int div(int a, int b);
}
