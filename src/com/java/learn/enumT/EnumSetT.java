package com.java.learn.enumT;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EnumSetT {

    public static void main(String[] args) {
        // 创建一个EnumSet集合，其内部的值就是MyDay枚举类的实例
        EnumSet<MyDay> enumSet = EnumSet.allOf(MyDay.class);
        System.out.println(enumSet);
        Iterator<MyDay> iterator = enumSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 创建一个空的EnumSet集合
        System.out.println("====================");
        EnumSet<MyDay> enumSet2 = EnumSet.noneOf(MyDay.class);
        System.out.println(enumSet2);
        enumSet2.add(MyDay.MONDAY);
        System.out.println(enumSet2);

        // 创建一个带有指定值的EnumSet
        System.out.println("====================");
        EnumSet<MyDay> enumSet3 = EnumSet.of(MyDay.MONDAY);
        enumSet2.add(MyDay.MONDAY);// 由于不可重复所以不会重复两个元素
        System.out.println(enumSet3);

        // 创建一个空的map
        EnumMap<MyDay, Object> enumMap = new EnumMap<>(MyDay.class);
        System.out.println(enumMap);
        enumMap.put(MyDay.MONDAY, "周一");
        enumMap.put(MyDay.THUSDAY, "周四");
        System.out.println(enumMap);

        // 创建第二个enumMap
        EnumMap<MyDay, Object> enumMap2 = new EnumMap<>(enumMap);
        System.out.println(enumMap2);

        // 以普通map为参数创建第三个enumMap，要求key必须是枚举类型
        Map map = new HashMap<>();
        map.put(MyDay.MONDAY, 111);
        EnumMap<MyDay, Object> enumMap3 = new EnumMap<>(map);
        System.out.println(enumMap3);

     /*   {}
        {MONDAY---1=周一, THUSDAY---2=周四}
        {MONDAY---1=周一, THUSDAY---2=周四}
        {MONDAY---1=111}*/

    }
}
