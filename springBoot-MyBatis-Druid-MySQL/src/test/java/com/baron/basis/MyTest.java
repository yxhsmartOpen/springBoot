package com.baron.basis;

import com.baron.aof23.EnumSingleton;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.SerializationUtils;

import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Baron
 * @date 2020/8/8 16:32
 */
@SpringBootApplication
public class MyTest implements ApplicationRunner {



    @Test
    public void genator() {
        SpringApplication.run(MyTest.class, "args");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        generateArtifacts();
    }

    private void generateArtifacts() throws Exception {
        List<String> warnings = new ArrayList<>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(
                this.getClass().getResourceAsStream("/generatorConfig.xml"));
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    /**
     * 测试枚举单例是否防御反射攻击，答案是肯定的。
     * 注释 @2 行，运行@1行。运行结果报错，看起来是因为没有空的构造函数导致的，还并不能下定义说防御了反射攻击。那它有什么构造函数呢，可以看它的父类Enum类：
     * 此时注释 @1 行，运行@2行。运行结果还是报错，提示非法操作，通过enum 创建的对象不能进行反射。查看 Constructor 源码的417行，有如下限制
     *
     * @throws Exception
     * @code if ((clazz.getModifiers() & Modifier.ENUM) != 0)
     * throw new IllegalArgumentException("Cannot reflectively create enum objects");
     * ...
     */
    @Test
    public void testEnumSingletonReflectively() throws Exception {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        // 拿到所有的构造函数，包括非public的
        // Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor(); // @1
        Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class); // @2
        constructor.setAccessible(true);

        System.out.println("拿到了构造器：" + constructor);
        // 拿到所有的构造函数，包括非public的
        EnumSingleton enumSingleton1 = constructor.newInstance("testInstance", 1);

        System.out.println(enumSingleton);
        System.out.println(enumSingleton1);
        System.out.println(enumSingleton == enumSingleton1);
    }

    /**
     * 测试枚举单例序列化反序列化安全性，答案是肯定的。运行结果返回为true。
     *
     * @throws Exception
     */
    @Test
    public void testEnumSingletonSerialization() throws Exception {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        byte[] serialize = SerializationUtils.serialize(enumSingleton);
        Object deserialize = SerializationUtils.deserialize(serialize);
        System.out.println(enumSingleton == deserialize); //true
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 多次运行会爆 {@link java.lang.NumberFormatException} 异常
     * 解决办法：
     * 1：每次使用的时候再创建 {@link java.text.SimpleDateFormat}对象，参考{@link MyTest#testSimpleDateFormat2()}
     * 2：通过{@link java.lang.ThreadLocal}对象解决线程不安全的问题，参考{@link MyTest#testSimpleDateFormat3()}
     * 3：通过 synchrinized 关键字加锁解决线程不安全问题，参考{@link MyTest#testSimpleDateFormat4()}
     */
    @Test
    public void testSimpleDateFormat() throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    System.out.println(sdf.parse("2017-12-13 15:17:27"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }

    /**
     * 每次使用的时候再创建{@link java.text.SimpleDateFormat}对象，这样虽然能保证线程安全，但是频繁创建和消费对象会造成资源的浪费。
     *
     * @throws InterruptedException
     */
    @Test
    public void testSimpleDateFormat2() throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    System.out.println(sdf1.parse("2017-12-13 15:17:27"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }


    ThreadLocal<DateFormat> dateFormatThreadLocal = new ThreadLocal<DateFormat>() {
        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    /**
     * 通过 {@link java.lang.ThreadLocal} 类解决 {@link java.text.SimpleDateFormat} 类线程不安全的问题
     */
    @Test
    public void testSimpleDateFormat3() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    System.out.println(dateFormatThreadLocal.get().parse("2017-12-13 15:17:27"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }

    /**
     * 通过 synchrinized 解决 {@link java.text.SimpleDateFormat} 类线程不安全的问题
     */
    @Test
    public void testSimpleDateFormat4() {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                try {
                    synchronized (sdf) {
                        System.out.println(sdf.parse("2017-12-13 15:17:27"));
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }

    @Test
    public void test1() {
        String ss = "sss";
        if ("true".equals(ss)) {
            System.out.println("1111");
        }

        System.out.println(ss.substring(0,1).toUpperCase());
        System.out.println(ss.substring(1,ss.length()));
        System.out.println(false && false && false);
    }

}
