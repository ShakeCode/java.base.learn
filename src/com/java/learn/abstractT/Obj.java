package com.java.learn.abstractT;

/**
 * 实际就是一个抽象类,使用抽象修饰是多于的
 * 可继承接口（抽象）类型，不可继承普通类型
 */
public abstract interface Obj extends Ob{

    //方法默认： public abstract ,属性默认public

    // 以下public 是多余修饰符
    //public void hello();

    // 写为
    void hello();

    // 不可final || static  +abstract  不然子类无法重写
    //final void he();

    // 允许像普通类有静态方法
    static void he() {
    }

    //jdk1.8开始 允许default
    default void Obj() {

    }
}
