package com.java.learn.Object.equalT;

public class iTemp {

    public static void main(String[] args) {
        // 优先级a--   大于-
        // a-- -b 标识先参与运算-b 后再自动减去1
        int a = 100, b = 50, c = a-- - b, d = a-- - b;
        System.out.println(a); //98
        System.out.println(b);   //50
        System.out.println(c);     //50
        System.out.println(d);       //49

        int i = 4;
        i++;

        System.out.println(i);
    }
}
