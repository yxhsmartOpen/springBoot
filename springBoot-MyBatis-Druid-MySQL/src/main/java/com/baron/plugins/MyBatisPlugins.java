package com.baron.plugins;



import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

/**
 * 自定义MyBatis插件，实现拦截 delete 执行语句是否添加了 where字段
 * @author Baron
 * @date 2020/9/6 15:14
 */
@Slf4j
@Intercepts({@Signature(type = Executor.class,method = "update",args = {MappedStatement.class,Object.class}),
        @Signature(type = Executor.class,method = "select",args = {MappedStatement.class,Object.class}),
        @Signature(type = Executor.class,method = "batch",args = {MappedStatement.class,Object.class})})
public class MyBatisPlugins implements Interceptor {

    private static String SQL_WHERE = "where";

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        // 获取方法的第0个参数，也就是MappedStatement。@Signature注解中的args中的顺序
        MappedStatement mappedStatement = (MappedStatement)invocation.getArgs()[0];
        //获取sql命令操作类型
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        final Object[] queryArgs = invocation.getArgs();
        final Object paramter = queryArgs[1];
        BoundSql boundSql = mappedStatement.getBoundSql(paramter);
        String sql = boundSql.getSql();
        if(SqlCommandType.DELETE.equals(sqlCommandType)){
            //格式化sql
            sql = sql.replace("\n","");
            if(!sql.toLowerCase().contains(SQL_WHERE)){
                sql = sql.replace(" ","");
                log.info("删除语句中没有where 条件，sql为{}",sql);
                throw new Exception("删除语句中没有where 条件");
            }
        }
        return invocation.proceed();
    }

    /**
     * 使用JDK的动态代理，给target对象创建一个delegate代理对象，以此来实现方法拦截和增强功能，它会回调intercept()方法
     * @param o 目标对象
     * @return 被代理的对象
     */
    @Override
    public Object plugin(Object o) { return Plugin.wrap(o,this); }

    @Override
    public void setProperties(Properties properties) { }
}
