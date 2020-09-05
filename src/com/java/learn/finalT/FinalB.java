package com.java.learn.finalT;

public class FinalB extends FinalA {

    // 默认值null
    private String nameB;

    double tall1 = 12.56;

    // final void run(){} //父类final 修饰的方法不能被重写

    public static void main(String[] args) {
        // 父类派生子类
        FinalA finalA = new FinalB();
        System.out.println(finalA.tall1);   // 父类tall1值
        System.out.println(finalA.tall1);    // 父类tall1值
        System.out.println(((FinalB) finalA).nameB); //引用子类 null

        FinalB finalB = new FinalB();
        System.out.println(finalB.address); //实例调用
        System.out.println(FinalB.address); //类对象调用

        System.out.println(finalB.age1);
        System.out.println(FinalB.age1);
        // System.out.println(FinalB.tall1); // 非静态成员，不能使用类名引用
        System.out.println(finalB.tall1);  // tall1 普通成员变量 非static，为默认类型，支持同包下子类继承使用，由类实例调用
    }
}
