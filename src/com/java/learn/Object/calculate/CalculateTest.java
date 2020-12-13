package com.java.learn.Object.calculate;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculateTest {

    public static void main(String[] args) {
        // array list 动态扩容 每次提升1.5倍容量，默认容量10,每次扩展 右移1位+上一次的容量
        // overflow-conscious code
     /*   int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);*/
        System.out.println(10>>1);

       /* 转换为2进制 10 变为 5
        0000 1010 -> 0000 0101*/

        int x,y;

        x=5>>2;

        y=x>>>2;

        System.out.println(y);  // 5 >> 2 相当于 5除于2的平方，等于1 ，>>> 表示无符号 右移，高位1用0 填充，0001 右移两位 0000，
    }
}
