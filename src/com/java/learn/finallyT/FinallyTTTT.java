package com.java.learn.finallyT;

public class FinallyTTTT {

    public static void main(String[] args) {
        FinallyTTTT test = new FinallyTTTT();
        System.out.println("和是：" + test.add(9, 34)); //3

       /*
        输出：
        finally语句块
        和是：43
        */
    }

    public int add(int a, int b) {
        try {
            return a + b;   //1     再临时变量
        } catch (Exception e) {
            System.out.println("catch语句块");
        } finally {
            System.out.println("finally语句块");       // 2
        }
        return 0;      // 不执行
    }
}
