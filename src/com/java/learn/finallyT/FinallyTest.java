package com.java.learn.finallyT;

/*
final,finally和finalize的区别 ?

final：最终的意思，可以修饰类，成员变量，成员方法
       修饰类，类不能被继承
       修饰变量，变量是常量 可被继承使用
       修饰方法，方法不能被重写，可被继承

finally：是异常处理的一部分，用于释放资源。
       一般来说，代码肯定会执行，特殊情况：在执行到finally之前jvm退出了

finalize：是Object类的一个方法，用于垃圾回收*/


/*
try...catch...finally的格式变形？
    A:try...catch...finally
    B:try...catch
    C:try...catch...catch...
    D:try...catch...catch...finally
    E:try...finally
     这种做法的目前是为了释放资源。
 */

/**
 * 根据官方的JVM规范：
 * 如果try语句里有return，返回的是try语句块中变量值。
 * 详细执行过程如下：
 * <p>
 * 如果有返回值，就把返回值保存到局部变量中；
 * 执行jsr指令跳到finally语句里执行；
 * 执行完finally语句后，返回之前保存在局部变量表里的值。
 * 如果try，finally语句里均有return，忽略try的return，而使用finally的return.
 */
public class FinallyTest {

    public static void main(String[] args) throws Exception {
        System.out.println(getInt()); // 输出: 80
        System.out.println(getIntReturn()); // 输出: 40

        try {
            int a = 10;
            System.out.println(a);
        } finally {

        }

        try {
            int a = 10;
            System.out.println(a);
        } catch (Exception e) {
            throw new Exception("异常了");
        } finally {

        }
    }

    public static int getInt() {
        int a = 10;               // 第1步
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a += 30;       //第2步    此时运算为40
            return a;         // 不会返回，后面还有finally 必须执行 ，没有finally 就立马返回
        } finally {
            a += 40;      // 第3步
            return a;    //这样结果就是80了。
        }
        // return a;
    }

    public static int getIntReturn() {
        int a = 10;               // 第1步
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a += 30;       //第2步    此时运算为40
            return a;         // 不会返回，如果后面还有finally 必须finally块执行，没有finally 就立马返回
        }
        return a;
    }

    public static int getValue() {
        try {
            return 0;     // 不返回0，存入临时变量
        } finally {
            return 1;     // 必须执行返回1 覆盖原临时变量并返回
        }
    }
}
