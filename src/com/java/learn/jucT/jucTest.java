package com.java.learn.jucT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class jucTest {

    public static void main(String[] args) {
        List<String> phoneList = Collections.synchronizedList(new ArrayList<>());
        // 读多写少时使用, 查询无加锁，新增加锁
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.get(0);
        copyOnWriteArrayList.add("123");
        // 读多写少时使用，基于CopyOnWriteArrayList 生成CopyOnWriteArraySet,查询无加锁，新增加锁
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        copyOnWriteArraySet.contains("123");
        copyOnWriteArraySet.add("123");

        // set 内部使用hash map， add 新增元素，使用map.put(); 使得key覆盖后唯一
        Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet<>());
        synchronizedSet.add("set");
    }
}
