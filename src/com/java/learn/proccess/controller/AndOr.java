package com.java.learn.proccess.controller;

public class AndOr {

    public static void main(String[] args) {
       /* 1.&和&&的区别？

        &：逻辑与（and）,运算符两边的表达式均经过计算为true时，整个结果才为true。

        &&：短路与，如果第一个表达式为false时，第二个表达式就不会计算了。

        |  和 || 同理
        */

        String s = "";
        if (s != null & s.length() > 0) {
            // s != null 无论对错,  s.length() 都得执行
        }

        if (s != null && s.length() > 0) {
            // 先执行 s!=null =false 就不计算 s.length()>0
        }

        if (s != null | s.length() > 0) {
            // s != null 无论对错,  s.length() 都得执行
        }

        if (s != null || s.length() > 0) {
            // 先执行 s!=null =true 就不计算 s.length()>0
        }
    }
}
