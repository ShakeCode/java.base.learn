package com.java.learn.Object;

import java.lang.reflect.InvocationTargetException;

/*
java创建对象的方式有哪些？

1.使用new关键字  ObjectName obj = new ObjectName()

2.使用反射机制创建对象：

(1)使用Class类的newInstance方法  ObjectName obj = ObjectName.class.newInstance();

(2)java.lang.reflect.Constructor类里也有一个newInstance方法可以创建对象。
 ObjectName obj = ObjectName.class.getConstructor.newInstance()

3.使用clone方法：先实现Cloneable接口并实现其定义的clone方法
 ObjectName obj = obj.clone(); 

4、使用反序列化（ObjectInputStream）的readObject()方法： try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) { ObjectName obj = ois.readObject(); }
*/
public class Apple implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * java object默认的基本方法中没有copy()，含有如下方法：
     * getClass(), hashCode(), equals(), clone(), toString(), notify(), notifyAll(),  wait(), finalize()
     *
     * @param args
     */

    public static void main(String[] args) throws CloneNotSupportedException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Apple apple = new Apple();
        System.out.println(apple.hashCode());    // 1163157884
        Object apple1 = apple.clone();    // 克隆对象在不同的地址单元上
        System.out.println(apple1.hashCode());    // 1956725890

        Apple apple2 = Apple.class.newInstance();
        System.out.println(apple2.hashCode());   // 356573597


        Apple apple3 = Apple.class.getConstructor().newInstance();
        System.out.println(apple3.hashCode());      // 1782113663
    }
}
