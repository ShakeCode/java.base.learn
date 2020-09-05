package com.java.learn.method;

public class MethodTest {

    // 和类同名方法
    void MethodTest(){}

    static final void hello() {
    }

    static void hello(int a) {
    }

    // 返回值不能作为重载判断条件
    /*static int hello(int a) {
    }*/

    final void hello(float a) {
    }

    static void hello(int a, int b) {
    }

    // 重载
    static void hello(int a, double b) {
    }

    // default 权限 本包，本类可见
    void eat() {
    }

    public void cry() {
    }

    protected void run() {
    }


}
