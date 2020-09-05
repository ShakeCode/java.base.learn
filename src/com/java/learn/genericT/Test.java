package com.java.learn.genericT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        StudentVO studentVO = new StudentVO("liming", 12);
        List<StudentVO> studentVOS = new ArrayList<>();
        studentVOS.add(studentVO);
        RequestVO requestVO = new RequestVO<>("student", "add", studentVOS);
        System.out.println(requestVO);

        List<Map<String, Object>> mapList = new ArrayList<>();
        mapList.add(new HashMap<String, Object>() {{
            put("address", "github");
        }});
        RequestVO requestVOMap = new RequestVO<>("map", "delete", mapList);
        System.out.println(requestVOMap);
        System.out.println(requestVOMap.getData());

        requestVOMap.setCity("东莞").setUserName("Jack Mask");

        System.out.println(requestVOMap);
        System.out.println(requestVOMap.getCity()+" "+requestVOMap.getUserName());
    }

    /*private static final <T> T calculate(T data1, T data2, Class<?> classType) {
        Object result = null;
        if (classType.isInstance(Integer.class)) {
            result = (int) data1 + (int) data2;
        } else if (classType.isInstance(Double.class)) {
            result = (double) data1 + (double) data2;
        } else if (classType.isInstance(float.class)) {
            result = (float) data1 + (float) data2;
        }
        return (T) result;
    }*/
}
