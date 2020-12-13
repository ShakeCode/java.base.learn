package com.java.learn.interfaceT;

public class FootBall implements Ball {

    // 接口可以被 private / protected 修饰，但是不合编程习惯, 一个接口被外部类(本包、不同包实现)
    private interface BallA {

        void say();
    }

    protected interface BallB {

    }

    // 接口使用 static 是多于的, 接口是完全对外公开的 可被实现
    protected static interface BallC {
        void run();
    }

    private enum Fruit implements BallA {
        APPLE("apple", "12");

        private String name;

        private String code;

        private Fruit(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        @Override
        public void say() {
            System.out.println("say ...");
        }
    }


    // 此处覆盖父类Ball 属性
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // 使用实现类name
        System.out.println("我是：如果我有属性name我就不用父类name:" + name + " i can fly");

    }

    @Override
    public void fly() {
    }

    public static void main(String[] args) {
        FootBall footBall = new FootBall();
        System.out.println(footBall.name);   // 子类存在属性，则输出子类属性， 子类没有找父类属性

        footBall.run();

        System.out.println(Fruit.APPLE.name);
        Fruit.APPLE.say();
    }

    @Override
    public void createBall() {

    }
}
