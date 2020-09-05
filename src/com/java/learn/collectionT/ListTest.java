package com.java.learn.collectionT;

import java.util.*;

public class ListTest {

    public static void main(String[] args) {
        char charArr[] = new char[]{'Z','A','b'};
        Arrays.sort(charArr);
        System.out.println(charArr);

        System.out.println("是否是字母:"+Character.isLetter('A'));
        System.out.println("是否是字母:"+Character.isLetter('!'));

        List<Character> list = new ArrayList<Character>();
        list.add('b');
        list.add('C');
        list.add('A');
        list.add('B');

        System.out.println((int) 'A');
        System.out.println((int) 'b');
        System.out.println((int) 'B');

        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.toLowerCase(o1)-Character.toLowerCase(o2);
            }

        });
        System.out.println(list);

        List<Integer> nums = new ArrayList<Integer>(){{
            add(5);
            add(3);
            add(1);
        }};
        nums.add(6);         // 顺序新增数据6
        nums.add(0,4);   // 在索引0上新增4，原有0索引的数据后移至索引1位置
        nums.remove(1);  // 移除索引1的位置上的数据

        System.out.println(nums);

        /**
         * 初始化为{5,3,1}
         * nums.add(6)后list为{5,3,1,6}
         * nums.add(0,4)是在0号索引上添加数字4得到list为{4,5,3,1,6}
         * nums.remove(1)是将1号索引上的5进行remove得到list为{4,3,1,6}
         */
    }
}
