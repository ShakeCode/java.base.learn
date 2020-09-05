package com.java.learn.testProgramer;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * int 类型长度受限，使用 BigInteger解决大数运算
 */
public class BigIntegerT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ss = scanner.nextLine();
            String[] arr = ss.split("\\s+"); // 匹配多个空白

            BigInteger b1 = new BigInteger(arr[0]);
            BigInteger b2 = new BigInteger(arr[1]);
            System.out.println(b1.add(b2));
        }
    }
}
