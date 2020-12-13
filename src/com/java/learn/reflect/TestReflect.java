package com.java.learn.reflect;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Test reflect.
 * 2020-12-13
 */
public class TestReflect {

    /**
     * The entry point of application.
     * @param args the input arguments
     * @throws NoSuchFieldException      the no such field exception
     * @throws ClassNotFoundException    the class not found exception
     * @throws IllegalAccessException    the illegal access exception
     * @throws InstantiationException    the instantiation exception
     * @throws IntrospectionException    the introspection exception
     * @throws InvocationTargetException the invocation target exception
     */
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException, IntrospectionException, InvocationTargetException, NoSuchMethodException {
        // getClassProperties();
        getClassValue();
        User user = new User("lijun", "GD-DG-SHU", 20);
        System.out.println(getClassValue(User.class, user, "name"));

        // getClassValueAA();
        List<User> list = new ArrayList<User>() {{
            add(new User("lijun", "GD-DG-SHU", 20));
            add(new User("xiaoming", "GD-GZ-BYZ", 30));
            add(new User("chenqiang", "GD-ZS-MKS", 40));
        }};
        for (User tempUser : list) {
            int score = 0;
            String name = (String) getClassValue(User.class, tempUser, "name");
            Integer age = (Integer) getClassValue(User.class, tempUser, "age");
            if (name != null || age != null) {
                score += 20;
            }
            tempUser.setScore(score);
        }
        System.out.println(list);
    }


    /**
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     */
    private static void getClassValue() throws ClassNotFoundException, IllegalAccessException {
        String className = User.class.getName();
        Class aClass = Class.forName(User.class.getName());
        // Object obj = aClass.newInstance();
        User user = new User("xiaoming", "GD-DG-SHU", 20);
        Field[] declaredFields = User.class.getDeclaredFields();
        for (Field field : declaredFields) {
            String fieldName = field.getName();
            Class fieldType = field.getType();
            field.setAccessible(true);
            // Object valueObj = field.get(obj);
            // 设置属性值
            if (fieldName.equals("name")) {
                field.set(user, "我是小明,我的属性值已临时改变");
            }
            Object valueObj = field.get(user);
            System.out.println("属性： " + fieldName + ", 值:" + valueObj + "\t类型：" + fieldType.getSimpleName());
        }
    }

    /**
     * @param classz
     * @param obj
     * @param fieldName
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     */
    private static Object getClassValue(Class<?> classz, Object obj, String fieldName) throws ClassNotFoundException, IllegalAccessException {
        Class aClass = Class.forName(classz.getName());
        Field[] declaredFields = User.class.getDeclaredFields();
        Object valueObj = null;
        for (Field field : declaredFields) {
            String name = field.getName();
            if (!name.equals(fieldName)) {
                continue;
            }
            field.setAccessible(true);
            valueObj = field.get(obj);
            if (valueObj == null) {
                continue;
            }
        }
        return valueObj;
    }

    /**
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws IntrospectionException
     * @throws InvocationTargetException
     */
    private static void getClassValueAA() throws ClassNotFoundException, IllegalAccessException, IntrospectionException, InvocationTargetException {
        String className = User.class.getName();
        Class aClass = Class.forName(User.class.getName());
        // Object obj = aClass.newInstance();
        User user = new User("lijun", "GD-DG-SHU", 20);
        Field[] declaredFields = User.class.getDeclaredFields();
        for (Field field : declaredFields) {
            String fieldName = field.getName();
            Class fieldType = field.getType();
            PropertyDescriptor pd = new PropertyDescriptor(field.getName(), aClass);
            Method getMethod = pd.getReadMethod();
            Object valueObj = getMethod.invoke(user);
            System.out.println("属性： " + fieldName + ", 值:" + valueObj + "\t类型：" + fieldType.getSimpleName());
        }
    }

    /**
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    private static void getClassProperties() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println(User.class.getName());
        System.out.println(User.class.getTypeName());
        System.out.println(User.class.getCanonicalName());
        System.out.println(User.class.getDeclaredFields());
        System.out.println(User.class.getClasses());
        System.out.println(User.class.getClass());
        System.out.println(User.class.getSimpleName());
        System.out.println(User.class.getConstructors());
        System.out.println(User.class.getDeclaredClasses());
        // System.out.println(User.class.getField("age"));
        Class classz = User.class;
        //调用他的构造方法
        Constructor constructor = classz.getConstructor(String.class, String.class, Integer.class);
        //通过newInstance实例化一个Person对象
        User person1 = (User) constructor.newInstance("luna", "中国大陆", 20);
        System.out.println(person1);
    }
}
