package com.java.learn.Object;

public class Variable {

   /* static float getA() {
        double d = 11.23;
        return d;   // 报错，不能自动向下转型，精度会缺失
    }*/

    static float getA() {
        int d = 11;
        return d;   // 自动向上转型
    }

    static float getB() {
        long ll = 11;
        return ll;   // 自动向上转型
    }

    static float getC() {
        short ll = 11;
        return ll;   // 自动向上转型
    }

    static double getD() {
        byte ll = 11;
        return ll;   // 自动向上转型
    }

    public static void main(String[] args) {
        // 小数值类型可自动升级大数值范围类型,或者手动强转: byte short int long float double
        // 相反 大数值范围的数值不能自动转换为 小数值的范围

        byte by = 1;

        System.out.println((double) by); //1.0

        double d = 11.23;
        System.out.println((int) d);    // 11


        System.out.println(getA());    // 11.0
        System.out.println(getB());    // 11.0
        System.out.println(getC());    // 11.0
        System.out.println(getD());    // 11.0

        System.out.println("10进制转换二进制：" + Integer.toBinaryString(51));
        System.out.println("2进制转换10进制：" + Integer.valueOf("110011", 2));

        // list 初始容量 10， 每次扩容 10>>1 = 5 +10 =15, 说明每次扩容为原来的1.5倍的容量
        System.out.println(10 >> 1);
    }
}
