package com.java.learn.finalT;

/**
 * final关键字可以用来修饰类、方法和变量（包括成员变量和局部变量）
 * <p>
 * 1、当用final修饰一个类时，表明这个类不能被继承!!!
 * <p>
 * 2、修饰方法，第一个原因是把方法锁定，以防任何继承类修改它的含义；第二个原因是效率
 * <p>
 * 2.1 final修饰的方法不能够被子类所重写!!!
 * <p>
 * 3、修饰变量，对于一个final变量，如果是基本数据类型的变量，则其数值一旦在初始化之后便不能更改；如果是引用类型的变量，则在对其初始化之后便不能再让其指向另一个对象。
 * <p>
 * 4、成员变量和局部变量
 * 4.1当用final作用于类的成员变量时，成员变量（注意是类的成员变量，局部变量只需要保证在使用之前被初始化赋值即可）必须在定义时或者构造器中进行初始化赋值，而且final变量一旦被初始化赋值之后，就不能再被赋值
 * 4.2引用变量被final修饰之后，虽然不能再指向其他对象，但是它指向的对象的内容是可变的
 * <p>
 * 5、final和static,static作用于成员变量用来表示只保存一份副本，而final的作用是用来保证变量不可变
 * <p>
 * 6、匿名内部类中使用的外部局部变量只能是final变量
 */
public class FinalA {

    // 不能被子类访问继承
    private static final String name = "finalA";

    // 可以被子类继承访问
    public static final String address = "finalA address";

    // 可被子类子类继承，默认值0
    protected static int age1;

    // default 权限，可被同包子类继承，默认值0.0
    double tall1=56.56;

    // private 权限，不能被子类继承
    private static int age;

    private double tall;

    // static 自上而下初始化静态代码块
    static {
        // name="1111"; 报错，final不能重写赋值
        age = 12;
    }

    final void run() {
        System.out.println(" i can run...");
    }


    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public static void main(String[] args) {
        System.out.println(age);    // 输出32

        // 局部成员变量，初始化不要求初始值，使用前必须初始值
        final String address;
        address = "i am address";
        System.out.println(address);

        final FinalA finalA = new FinalA();  // final修饰类
        finalA.setTall(1.65);  // 内容可以改变

        // finalA = new FinalA(); 无法再次初始化
    }

    // static 自上而下初始化静态代码块
    static {
        age += 20;
    }
}
