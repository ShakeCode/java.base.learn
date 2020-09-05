package com.java.learn.proccess.controller;

public class SwitchT {

    public static void main(String[] args) {
        int age = 2;
        switch (age){
            case 0:
                System.out.println("age 0:"+"test");  // 没有break 开始匹配case进入执行
            case 1:
            case 2:                                     // age=0 时 继续进入，直到遇到break跳出所有case
                System.out.println("age1 2:"+"test");
            case 3:
                System.out.println("age 3:"+"test3");
                //break;                                  // break 后跳出
            case 4:
                System.out.println("age 4:"+"test");
            default:
                break;
        }

      /* age=0 输出：
        age 0:test
        age1 2:test
        age 3:test3*/

        /*     age=1 或者age=2 开始匹配到case1 case 2 就匹配命中开始执行
        age1 2:test
        age 3:test3*/

    }
}
