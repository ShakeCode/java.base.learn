package com.java.learn.collectionT;

import java.util.HashSet;
import java.util.Set;

public class SetT {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        System.out.println(set.add(1));   // 不存在1 返回true
        System.out.println(set.add(1));   // 已存在1 返回false 不报错,不会插入
        System.out.println(set);  // [1]

        set.add(2);
        set.add(1);
        System.out.println(set);
        System.out.println(set.remove(1));  // 删除元素值 1

        System.out.println(set);
    }
}
