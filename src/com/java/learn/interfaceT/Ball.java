package com.java.learn.interfaceT;

/**
 * 特殊抽象类,是抽象类的抽象方法集合 ,多继承多个接口类,实际是多实现
 */
public interface Ball extends BallFactory, ObjFactory {

    //不允许有 String name;

    // 成员变量默认是public static final 常量类型,必须初始化
    String name = "ball";

    // 成员方法默认是public

    //protected void run(); // 不允许

    void run(); // 编译的是 public abstract void run(); 子类必须重写声明 可无方法体

    public void fly();  // 此处public 是多于的

    // final void run();    // 默认是abstract 和 final 导致子类不能覆盖重写，不允许
    // static final void run(); // 不允许static 和 final 组合

    //以下是 jdk1.8 特性
    default void hello() {
        System.out.println("i am hello");
    }


    static String getName() {
        return name;
    }
}
