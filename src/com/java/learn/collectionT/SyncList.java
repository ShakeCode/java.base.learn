package com.java.learn.collectionT;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SyncList {

    private static final ConcurrentHashMap<String, Object> CONCURRENT_HASH_MAP = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        // 转换list 为线程安全list
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        // 内部方法含有同步块，锁住对象本身
        synchronizedList.add("1");
        synchronizedList.add("3");
        synchronizedList.add("2");
        //迭代器线程不安全，官网推荐
        synchronized (synchronizedList) {
            Iterator<String> ite = synchronizedList.iterator();
            while (ite.hasNext()) {
                System.out.println(ite.next());
            }
        }

        Collections.sort(synchronizedList);
        System.out.println(synchronizedList);


        Vector<String> vector = new Vector<>();

        // 线程安全是因为synchronized 修改了方法
        vector.add("a");
        vector.add("b");
        System.out.println(vector.remove(0));

        System.out.println(vector);
    }
}
