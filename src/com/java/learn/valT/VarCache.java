package com.java.learn.valT;

/**
 * 变量缓存
 */
public class VarCache {

    public static void main(String[] args) {
        int m=12,n=34;
        System.out.print((m++) +""+ (++n));     //12->13    34->35
        System.out.print((n++) +""+ (++m));  //35 13->14   输出: 12353514

        System.out.println();
        int i = 0;
        i = i++;
        System.out.println(i);     // 输出0，不是1

        /*
        变量缓存:
        int temp=i;//这个temp就是i++这个表达式的值
        i=i+1;//然后自增
        i=temp;//赋值给i*/

        int j = 0;
        j = i--;
        System.out.println(j);     // 输出0，不是-1

        /*
        变量缓存:
        int temp=i;//这个temp就是i++这个表达式的值
        i=i-1;//然后自增
        i=temp;//赋值给i*/
    }
}
