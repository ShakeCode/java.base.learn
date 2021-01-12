package com.java.learn.extendT.template;

public abstract class BaseTemplate {

    public abstract void buyFood(String name);

    public abstract void cooking(String name);

    public void eatFood(String name) {
        buyFood(name);
        cooking(name);
        System.out.println("eat food so happy!");
    }
}
