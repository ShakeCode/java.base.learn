package com.java.learn.Object.equalT;

public class EqualTest {

    public static void main(String[] args) {
         /*==可用于基本类型和引用类型：当用于基本类型时候，是比较值是否相同；当用于引用类型的时候，是比较对象是否相同。
    "=="和"!="比较的是地址 指第一个new()c出来的地址*/

        Integer a = new Integer(12);
        Integer b = new Integer(12);
        System.out.println("比较值：" + a.equals(b));
        System.out.println("比较内存地址:" + (a == b));
        System.out.println("比较内存地址：" + (a != b));

        /*Integer bb = new Integer(128);
        Integer cc = bb;
        int dd = 127;
        System.out.println(dd==cc);
        System.out.println(bb.equals(dd));*/

        String s = "abc";
        String s1 = s;
        String s2 = new String("abc");
        System.out.println(s == s1);  // 地址复用，true
        System.out.println(s.equals(s1)); // 值相等

        System.out.println(s2.equals(s1)); // 值相等
        System.out.println(s2 == s);  // 地址不相等

        String s3 = s.intern();
        System.out.println(s3==s);
        System.out.println(s3.equals(s));
    }

}
