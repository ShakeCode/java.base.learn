package com.java.learn.Object;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        System.out.println(Math.max(1,5));

        //数组是一个对象，连续的数据结构
        int[] aa = new int[12];

        int a[] = new int[1];
        a[0] = 12;
        int b[] = new int[]{10, 2, 5, 56};
        System.out.println(Arrays.toString(b));

        // 小到大排序
        Arrays.sort(b);

        System.out.println("排序后："+Arrays.toString(b));

        double f[] = new double[]{10.56, 2.56, 50.89, 56};
        System.out.println(Arrays.toString(f));
        // 小到大排序
        Arrays.sort(f);

        System.out.println("排序后："+Arrays.toString(f));
        // 声明
        int[][] cc = new int[3][4];
        int cc1[][] = new int[3][4];

        //初始化并定义
        int c[][] = new int[][]{{1, 2, 3}, {2, 3, 4, 6}};
        System.out.println("二维数组:" + Arrays.deepToString(c));

        System.out.println("二维数组长度，包含的一维数组个数:" + c.length);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println("索引-"+"c[" + i + "]" + "[" + j + "]" + ":" + c[i][j]);
            }
        }
    }
}
