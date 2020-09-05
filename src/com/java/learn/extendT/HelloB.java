package com.java.learn.extendT;

/**
 * Java程序初始化工作可以在许多不同的代码块中来完成，它们的执行顺序如下：
 * 父类的静态变量、父类的静态代码块、子类的静态变量、子类的静态代码块、
 * 父类的非静态变量、父类的非静态代码块、父类的构造函数、
 * 子类的非静态变量、子类的非静态代码块、子类的构造函数。
 */
public class HelloB extends HelloA
{
    public HelloB()
    {
        System.out.println("I’m B 构造函数");
    }
    {
        System.out.println("I’m B class");
    }
    static
    {
        System.out.println("static B");
    }
    public static void main(String[] args)
    {
        new HelloB();

        /**
         * static A
         * static B
         * I’m A class
         * I’m B class
         */
    }
}