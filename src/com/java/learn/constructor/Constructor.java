package com.java.learn.constructor;

public class Constructor {

    // 静态成员内部类

    static class C {
        private String name;

        public C(String name) {
            this.name = name;
        }
    }

    // 成员内部类
    class A {
        // 私有成员，私有方法不能被继承
        private String name;

        public static final String address = "address-A";

        // 公开成员被继承
        public int age;
        // 可被子类继承
        protected double tall;

        public A(String name, int age, double tall) {
            this.name = name;
            this.age = age;
            this.tall = tall;

            // 调用成员方法
            this.say();  //  取当前实例!!!的say()
            say();  //  取当前实例!!!的say()
        }
        // public static  void run(){} 、public static final void run(){} 内部类不能拥有静态方法

        public final void run() {
            System.out.println("A is run ...");
        }

        public void say() {
            // 调用构造方法
            A aa = new A("", 12, 16.66);

            System.out.println("A is run ...");

            // 方法内部类
            class D {
                private String name;

                private static final int age = 12;

                public D(String name) {
                    this.name = name;
                }

                // public static final String name(){}  // 不能静态声明

                public void say() {
                    System.out.println("i am D, now retuan");
                }
            }
            new D("D").say();
        }
    }

    class B extends A {
        public B(String name, int age, double tall) {
            super(name, age, tall);
            say();
        }

        // 继承父类之后，默认的构造器必须和super父类

        // 不合法默认构造器,public B(){},需和父类保持一致

        public void say() {
            System.out.println("i am B...");

            // B FootBallA = new B("",12,12.66);
        }
    }

    public static void main(String[] args) {
        B b = new Constructor().new B("i am B", 12, 1.78d);
        // System.out.println(b.name); // 不可访问私有成员变量
        System.out.println(b.age);
        System.out.println(b.tall);
        b.say();

        C c = new Constructor.C("i am C");
        System.out.println(c.name);
        // System.out.println(Constructor.C.name); // 静态上下文不能访问非静态成员，变量，方法


        // 匿名内部类 ,lambda
        new Thread(() -> {
            System.out.println("i am thread ...");
        }).start();


    }
}
