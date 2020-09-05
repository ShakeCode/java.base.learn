package com.java.learn.ThreadTest;

/**
 * 三目运算
 * <p>
 * 三目运算符<表达式1>?<表达式2>:<表达式3>; "?"运算符的含义是: 先求表达式1的值, 如果为真, 则执行表达式2，并返回表达式2的结果 ; 如果表达式1的值为假, 则执行表达式3 ，并返回表达式3的结果.
 */
public class ThreeUnaryCal {

    public static void main(String[] args) {
       /* 核心思想：

        1.若三目运算符中的两个表达式有一个是常量表达式，另一个是类型T的表达式，且常量表达式可以被T表示，则输出结果是T类型。

        2.如果都是常量表达式，用向上类型转换*/

        int a = 5;
        System.out.println("a=" + ((a < 5) ? 10.9 : 9));  //a=9.0
        // java会根据运算符的精度类型进行自动类型转换。因此9会变为9.0

        System.out.println(false ? 9 : 10.0);  // 10.0

        System.out.println(true ? 9 : 10.0);   //9.0

        char x = 'x';
        int i = 10;
        System.out.println(false ? i : x);  //120
        System.out.println(false ? 100 : x);    //x
        // 若三目运算符中的两个表达式有一个是常量表达式，另一个是类型T的表达式，且常量表达式可以被T表示，则输出结果是T类型。因此输出是字符x

        System.out.println(true ? 100 : x); // d  100 转字符为x
        System.out.println(true ? x : 10.0);        // 120.0   包含常量表达式10.0， x 可以被10.0表示
        // 数字 转 ASCII 字符
        System.out.println("对应ASCII码：" + (char) Integer.parseInt("120"));
        System.out.println("对应ASCII码：" + (char) Integer.parseInt("100"));
        System.out.println("对应ASCII码：" + (char) Integer.parseInt("48"));
        System.out.println("对应ASCII码：" + (char) Integer.parseInt("65"));


        System.out.println("对应ASCII码：" + (char) 33);       //!
        System.out.println("对应ASCII码：" + (char) 48);        //0
        System.out.println("对应ASCII码：" + (char) 57);        //9
        System.out.println("对应ASCII码：" + (char) 65);     //A
        System.out.println("对应ASCII码：" + (char) 90);     //Z
        System.out.println("对应ASCII码：" + (char) 97);  //a
        System.out.println("对应ASCII码：" + (char) 122);     //z
    }

    /**
     * ASCII 码对应：
     *
     * 第33～126号(共94个)是字符，
     *
     * 其中第48～57号为0～9十个阿拉伯数字；
     *
     * 65～90号为26个大写英文字母，
     *
     * 97～122号为26个小写英文字母，
     *
     * 其余为一些标点符号、运算符号等。
     *
     */

    /**
     * ASCII 字符 转 数字
     *
     * @param str
     * @return
     */
    public static int SumStrAscii(String str) {
        byte[] bytestr = str.getBytes();
        int sum = 0;
        for (int i = 0; i < bytestr.length; i++) {
            sum += bytestr[i];
        }
        return sum;
    }
}
