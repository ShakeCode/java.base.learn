package com.java.learn.Object;
/*
一、Java基本数据类型
　　基本数据类型有8种：byte、short、int、long、float、double、boolean、char

　　分为4类：整数型、浮点型、布尔型、字符型。

　　整数型：byte、short、int、long

　　浮点型：float、double

　　布尔型：boolean

　　字符型：char



二、各数据类型所占字节大小
　　计算机的基本单位：bit .　　一个bit代表一个0或1

　　byte：1byte = 8bit　　　　 1个字节是8个bit

　　short：2byte

　　int：4byte

　　long：8byte

　　float：4byte

　　double：8byte

　　boolean：1byte

　　char：2byte*/

public class DefaultValue {

    private String name;
    private int age;
    double tall;

   /* boolean        false

    char              '/uoooo'(null)

    byte              (byte)0

    short             (short)0

    int                  0

    integer默认值为null

    long               0L

    float               0.0f

    double           0.0d

    int数组 默认0
    */

    public static void main(String[] args) {
        // 方法中的成员
        int i = 1;
        Object obj = 0.2; // 默认double 类型

        DefaultValue defaultValue = new DefaultValue();
        // 类成员的变量，拥有默认值
        System.out.println(defaultValue.age);   // 0
        System.out.println(defaultValue.name);  // null
        System.out.println(defaultValue.tall);  //0.0

        int a;
        //基本类型可以声明不赋值，但是使用前必须初始化数值
        //报错：未赋值 if(a<1){}

        int aa;
        char c;
        boolean bb;
        // System.out.println(FootBallA); System.out.println(c); System.out.println(bb); // 报错 尚未初始化
    }
}
