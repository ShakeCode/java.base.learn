package com.java.learn.abstractT;

/*
接口和抽象类有什么区别？

抽象类：用abstract修饰，抽象类不能创建实例对象。抽象方法必须在子类中实现，不能有抽象构造方法或者抽象静态方法。

接口：抽象类的一种特例，接口中的方法必须是抽象的。

两者的区别：

1.抽象类可以有构造方法，接口没有构造方法!!!!!

2.抽象类可以有普通成员变量，接口没有普通成员变量。

3.抽象类可以有非抽象的普通方法，接口中的方法必须是抽象的。

4.抽象类中的抽象方法访问类型可以是public，protected，接口中抽闲方法必须是public类型的。

5.抽象类可以包含静态方法，接口中不能包含静态方法。

6.一个类可以实现多个接口，但是只能继承一个抽象类。

7.接口中基本数据类型的数据成员，都默认为static和final，抽象类则不是。

8.抽象类的子类使用 extends 来继承；接口必须使用 implements 来实现接口。
*/

/* jdk1.8之前

         接口
         1.多实现
         2.变量类型默认且只能为为public static final
3.函数类型默认且只能为public，只能有public类型的静态成员函数

        4.非静态成员函数没有方法体，静态成员函数有方法体

        5.子类必须实现所有接口函数

        6.可以有main方法；可以new一个接口，需要在方法体中实现所有接口函数

        7.没有构造器


        抽象类

        1.单继承,多实现

        2.变量类型不限（静态变量+非静态变量）

        3.函数类型不限（静态函数+非静态函数）

        4.非静态函数包含没有方法体的抽象函数. 有方法体的普通函数

        5.子类可以不覆写父类的抽象方法，但子类也要申明为抽象类；子类可以选择覆写父类的非抽象方法

        6.可以有main方法；不可以new一个抽象类

        7.可以有构造方法！！！！


        Jdk1.8

        接口中可以有default类型的方法，实现类可以选择实现该方法

        意义：默认方法的主要优势是提供一种拓展接口的方法，而不破坏现有代码。另一个优势为该方法是可选的，子类可以根据不同的需求Override或默认实现。*/

public abstract class Animal extends Female implements A, B {

    /*
    非法:
    public abstract static void hello();
    public abstract final void hello();  // 必须被子类继承重写，不可以修饰为final
    private abstract void run();       // 需要配子类继承，可以修饰权限为: public protected

    abstract void run();  // 只能给同包下子类 继承重写
    */

    // 抽象方法 不一定需要包含抽象方法
    public abstract void say();

    protected abstract void angry();

    //常量
    private static final String aa = "12";

    //属性
    // 不允许修饰成员 变量 private abstract String name;


    private String name;

    // 构造器  可以有构造方法，接口虽然是特殊的抽象类，但是不能有构造方法
    public Animal(String name) {
        this.name = name;
    }

    //静态final方法
    private static final void run() {

    }

    // 静态方法
    private static void cry() {

    }

    // 普通方法
    private void hungry() {

    }

    public static void main(String[] args) {
        // 抽象类和接口不能实例化
        // Animal animal1 = new Animal();

        Animal animal = new Animal("animal!!!") {
            @Override
            public void name() {
                System.out.println("i am animal");
            }

            @Override
            public void say() {
                System.out.println("say...");
            }

            @Override
            protected void angry() {
                System.out.println("angry...");
            }
        };

        animal.angry();
        System.out.println(animal.sex);
        System.out.println(animal.name);
        System.out.println(animal.nameIs);
    }
}
