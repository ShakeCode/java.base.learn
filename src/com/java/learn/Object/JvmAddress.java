package com.java.learn.Object;

public class JvmAddress {

    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        System.out.println("a:"+System.identityHashCode(a));
        System.out.println("b:"+System.identityHashCode(b));
        operator(a, b);

        System.out.println("@@a:"+System.identityHashCode(a));
        System.out.println("@@b:"+System.identityHashCode(b));

        System.out.println("运行结果："+a + "," + b);
    }
    public static void operator(StringBuffer x, StringBuffer y) {
        x.append(y); //此时AB
        System.out.println("##x:"+System.identityHashCode(x));
        System.out.println("##y:"+System.identityHashCode(y));
        y = x;       // y 的地址和x 一样，但是b地址不变

        System.out.println("##x:"+System.identityHashCode(x));
        System.out.println("##y:"+System.identityHashCode(y));
    }
}
