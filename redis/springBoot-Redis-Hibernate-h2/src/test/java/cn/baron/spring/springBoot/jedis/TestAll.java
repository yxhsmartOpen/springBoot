package cn.baron.spring.springBoot.jedis;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Baron
 * @date 2020/8/5 7:56
 */
public class TestAll {

    @Test
    public void testJedis() throws Exception {
        // 创建一个连接Jedis对象，参数：host、port
        /*Jedis jedis = new Jedis("106.55.23.191", 6379);*/
        Jedis jedis = new Jedis("106.55.23.191",6379);
        // 直接使用jedis操作redis。所有jedis的命令都对应一个方法。
        jedis.set("bwcx9393", "欢迎关注Java面试通关手册");
        String string = jedis.get("bwcx9393");
        System.out.println(string);

        // 关闭连接
        jedis.close();
    }


    @Test
    public void  testJedisPool() throws Exception{
        // 创建一个连接池对象，两个参数host、port
        JedisPool jedisPool = new JedisPool("106.55.23.191", 6379);
        // 从连接池获得一个连接，就是一个jedis对象。
        Jedis jedis = jedisPool.getResource();
        jedis.set("xxa99","wo shi shui,you shui neng gao su wo !");
        // 使用jedis操作redis
        String str = jedis.get("xxa99");
        System.out.println(str);
        // 关闭连接，每次使用完毕后关闭连接。连接池回收资源。
        jedis.close();
        // 关闭连接池。
        jedisPool.close();

    }

    @Test
    public void testJedisCluster() throws Exception{
        // 创建一个JedisCluster对象。有一个参数nodes是一个set类型。set中包含若干个HostAndPort对象。
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        nodes.add(new HostAndPort("106.55.23.191", 7001));
        nodes.add(new HostAndPort("106.55.23.191", 7002));
        nodes.add(new HostAndPort("106.55.23.191", 7003));
        nodes.add(new HostAndPort("106.55.23.191", 7004));
        nodes.add(new HostAndPort("106.55.23.191", 7005));
        nodes.add(new HostAndPort("106.55.23.191", 7006));
        JedisCluster jedisCluster = new JedisCluster(nodes);
        // 直接使用JedisCluster对象操作redis。
        jedisCluster.set("yxh22","my name is xiao kang !");
        String string = jedisCluster.get("yxh22");
        System.out.println(string);
        // 关闭JedisCluster对象
        jedisCluster.close();
    }




}
