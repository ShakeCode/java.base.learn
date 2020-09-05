package com.java.learn.extendT;



public class B extends A {

    // 此处覆盖父类，调用的时候取自己的方法，没有就取父类的
    public void run() {
        super.run(); // 调用父类run
        System.out.println("B can run...");
    }

    // 静态方法可以继承,此处覆盖父类，调用的时候取自己的方法，没有就取父类的
    static void eat() {
        System.out.println("B can eat...");
    }

    // 默认值false
    static boolean aBoolean;

    // Object默认值0.0
    static double aDouble;

    // 默认值0
    static int age;

    // static final void sleep() {}  // final 不能重写

    public static void main(String[] args) {
        // 引用静态变量OK
        System.out.println("引用静态变量:" + aBoolean);

        B b = new B();

        System.out.println("B 的静态成员:" + B.aBoolean);

        b.cry();
        b.run();

        b.hello();
        b.eat();

        B.sleep();

        // b.say(); 私有不能继承
    }
}
