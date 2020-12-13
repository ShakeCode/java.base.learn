package com.java.learn.stasticT;

public class Test {

    // 非final修饰，可以被修改, 可以使用类名或者对象实例名访问，但提倡使用类名访问静态变量
    public static int a = 1;

    public static void main(String[] args) {

        int a = 10;

        a++;          //1
        Test.a++;     //2

        Test t = new Test();

        System.out.println("a=" + a + " t.a=" + t.a);   // a=11 t.a=2

    }
}
