package com.java.learn.constructor;

public class ConstructorTest {

    private String name;
    private int age;

    public ConstructorTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ConstructorTest(String name) {
         this(name,12);  // 代表自己的构造函数，放在第一行

         // new ConstructorTest(name,20);
    }

    @Override
    public String toString() {
        return "ConstructorTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new ConstructorTest("liming"));
    }
}
