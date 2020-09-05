package com.java.learn.extendT;

public class InstanceOF {
    class A {
    }

    class B extends A {
    }

    class C extends A {
    }

    class D extends B {
    }

    public static void main(String[] args) {
        A obj = new InstanceOF().new D();

        System.out.println(obj instanceof B);  // true

        System.out.println(obj instanceof C);    // false

        System.out.println(obj instanceof D);   // true

        System.out.println(obj instanceof A);   // true
    }

}
