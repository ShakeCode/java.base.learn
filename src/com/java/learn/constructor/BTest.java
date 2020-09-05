package com.java.learn.constructor;

import com.java.learn.extendT.A;

public class BTest extends A {

    public static void main(String[] args) {
        BTest bTest = new BTest();
        // bTest.cry(); //报错!!! cry() 是A 中default 权限修饰，不被外部包类使用，可被同包类使用
    }
}
