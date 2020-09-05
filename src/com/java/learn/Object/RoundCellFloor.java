package com.java.learn.Object;

public class RoundCellFloor {

    public static void main(String[] args) {
        int x = -5;
        int y = -12;
        System.out.println(y % x);  // -2

        System.out.println(Math.max(1, 10));     //10

        // floor  地板，向下取整double  向小数取
        System.out.println(Math.floor(0.56));   // 0.0
        System.out.println(Math.floor(10.56));    // 10.0
        System.out.println(Math.floor(-10.56));   //  -11.0


        // ceil    天花板，向上取整double   向大数取
        System.out.println(Math.ceil(0.56));    //1.0
        System.out.println(Math.ceil(10.56));  // 11.0
        System.out.println(Math.ceil(-10.56)); // -10.0

        // round   四舍五入 返回long 类型
        System.out.println(Math.round(0.48));    //0
        System.out.println(Math.round(0.56));    // 1
        System.out.println(Math.round(10.56));   // 11
        System.out.println(Math.round(-10.56));  //-11

        //四舍五入 返回int 类型
        System.out.println("float 四舍五入 取int："+Math.round(0.48f));   //0
        System.out.println("float 四舍五入 取int："+Math.round(0.56f));   // 1
        System.out.println("float 四舍五入 取int："+Math.round(10.56f));  // 11
        System.out.println("float 四舍五入 取int："+Math.round(-10.56f)); //-11
    }
}
