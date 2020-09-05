package com.java.learn.interfaceT;

public class FootBall implements Ball {

    // 此处覆盖父类Ball 属性
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // 使用实现类name
        System.out.println("我是：如果我有属性name我就不用父类name:" + name + " i can fly");

    }

    @Override
    public void fly() {

    }

    public static void main(String[] args) {
        FootBall footBall = new FootBall();
        System.out.println(footBall.name);   // 子类存在属性，则输出子类属性， 子类没有找父类属性

        footBall.run();
    }

    @Override
    public void createBall() {

    }
}
