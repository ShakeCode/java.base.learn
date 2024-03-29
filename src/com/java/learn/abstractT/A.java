package com.java.learn.abstractT;

/**
 * 接口
 * 1.在接口中只有方法的声明，没有方法体。
 * 2.在接口中只有常量，因为定义的变量，在编译的时候都会默认加上
 *   public static final
 * 3.在接口中的方法，永远都被public来修饰。
 * 4.接口中没有构造方法，也不能实例化接口的对象。
 * 5.接口可以实现多继承
 * 6.接口中定义的方法都需要有实现类来实现，如果实现类不能实现接口中的所有方法，则实现类定义为抽象类。
 */
public interface A {

    void name();
}
