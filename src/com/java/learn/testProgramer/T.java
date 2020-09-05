package com.java.learn.testProgramer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class T {

    public static void main(String[] args) {
        // 字符翻转
        /*Scanner scanner = new Scanner(System.in);
        StringBuffer sbu = new StringBuffer();
        String ss = scanner.nextLine();
        char[] charArr = ss.toCharArray();
        for (int i = charArr.length-1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }*/
//        extractNum();

        reverseWord();
    }

    private static void reverseWord() {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sbu = new StringBuffer();
        String ss = scanner.nextLine();
        String[] arr = ss.split("\\s+");  //  \\s 匹配任意空白
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }


    private static void extractNum() {
        // 提取不重复整数
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuffer sb = new StringBuffer(str);
        Set s = new HashSet();
        sb.reverse();//字符串反转
        for(int i = 0;i<sb.length();i++){
            if(s.add(sb.substring(i,i+1))){//set不允许重复添加相同的元素
                System.out.print(sb.substring(i,i+1));
            }
        }
    }
}
