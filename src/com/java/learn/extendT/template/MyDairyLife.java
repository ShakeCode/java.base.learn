package com.java.learn.extendT.template;

public class MyDairyLife extends BaseTemplate {
    @Override
    public void buyFood(String name) {
        System.out.println("buyFood:" + name);
    }

    @Override
    public void cooking(String name) {
        System.out.println("cooking:" + name);
    }

    public static void main(String[] args) {
        new MyDairyLife().eatFood("油条");
    }
}
