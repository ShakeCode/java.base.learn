package com.java.learn.Object.equalT;

public class BooleanTest {

    // 类成员，有默认值false
    private boolean isFine;

    // 类成员，有默认值false
    private static boolean isCorrect;

    public static void main(String[] args) {
        BooleanTest booleanTest = new BooleanTest();
        System.out.println(booleanTest.isFine);
        System.out.println(BooleanTest.isCorrect);

        Boolean b = true;
        // 赋值
        b = false;
        System.out.println(b);
        System.out.println(b == true);  // 判断值
        System.out.println(b != true);
        // 报错，不同类型不可比较 if(b>1){}
    }
}
