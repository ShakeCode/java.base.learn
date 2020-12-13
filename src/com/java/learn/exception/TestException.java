package com.java.learn.exception;

public class TestException {

    public static void main(String[] args) {
        // 隐藏着发生NullPointerException 异常, NullPointerException继承RuntimeException
        // 运行时异常不需要声明异常，或者手动抛出
        run();
    }

    static void run() {
        String name = null;
        System.out.println(name.equals("hello"));
    }
}
