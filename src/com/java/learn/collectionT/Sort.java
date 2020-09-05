package com.java.learn.collectionT;

import java.util.*;

public class Sort {


    class Student implements Comparable<Student> {

        private String name;

        private double score;

        public Student(String name, double score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        @Override
        public int compareTo(Student o) {
//            return o.getScore() - this.getScore() > 0 ? 1 : -1;  // 大到小排序
            return o.score - this.score < 0 ? 1 : -1;  // 小到大排序
        }
    }

    public static void main(String[] args) {
        TreeSet<Student> tree = new TreeSet<>();
        tree.add(new Sort().new Student("小米", 98.88));
        tree.add(new Sort().new Student("小宏", 18.88));
        tree.add(new Sort().new Student("小海", 99.88));

        System.out.println("排序后:" + tree);

        List<Student> list= new ArrayList<>();
        list.add(new Sort().new Student("小米", 98.88));
        list.add(new Sort().new Student("小宏", 18.88));
        list.add(new Sort().new Student("小海", 99.88));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore() - o1.getScore() > 0 ? 1 : -1;  // 大到小排序
            }
        });

        System.out.println("大到小排序后："+list);

        // lambda 简写
        Collections.sort(list,(a,b)-> a.getScore() - b.getScore() > 0 ? 1 : -1); //小到大排序

        System.out.println("小到大排序后:"+list);
    }

}
