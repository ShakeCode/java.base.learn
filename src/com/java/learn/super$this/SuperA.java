package com.java.learn.super$this;


/**
 * super 值调用父类方法 ，必须出现在构造构造方法第一行
 * this 调用方法时取当前对象的实例方法
 */
public class SuperA {

    public static void main(String[] args) {
        Bird b = new SuperA().new Bird();
        b.run();
    }

    class Animal {
        int eye = 2;

        public Animal() {
            super();     //2
            this.run();  //3  此时注意子类实例时取子类方法
            System.out.println("动物");     //8
        }

        public void run() {
            System.out.println("动物有不同走路方式"); //5
        }
    }

    class Bird extends Animal {
        public Bird() {
            super();  //1  //调用父类方法
            System.out.println("鸟类");      //9
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run(); //4 通过super可以用父类方法和属性      //10
            System.out.println("鸟是飞飞飞飞飞飞"); //6           //11
            System.out.println("鸟类有" + super.eye + "只眼睛"); //7  //12
        }

    }
}
