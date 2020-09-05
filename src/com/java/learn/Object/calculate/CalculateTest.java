package com.java.learn.Object.calculate;

public class CalculateTest {

    public static void main(String[] args) {
        int x,y;

        x=5>>2;

        y=x>>>2;

        System.out.println(y);  // 5 >> 2 相当于 5除于2的平方，等于1 ，>>> 表示无符号 右移，高位1用0 填充，0001 右移两位 0000，
    }
}
