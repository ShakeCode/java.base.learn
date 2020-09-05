package com.java.learn.genericT;

/**
 * PECS（Producer Extends Consumer Super）原则，已经很好理解了：
 *
 * 频繁往外读取内容的，适合用上界Extends。
 * 经常往里插入的，适合用下界Super。
 */
public class SuperExtendT {

    class Food{
        private String name;
        private String color;

        public Food(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Food{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    class Fruit extends Food{
        public Fruit(String name) {
            super(name);
        }

    }

    class Apple extends Fruit{

        public Apple(String name) {
            super(name);
        }
    }

    class Plate<T>{

        T item;

        public Plate(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }

    public static void main(String[] args) {
        //Plate<Fruit> plate1 = new SuperExtendT().new Plate<Apple>(new SuperExtendT().new Apple());
        // 上限通配符
        Plate<? extends Fruit> plate = new SuperExtendT().new Plate<>(new SuperExtendT().new Apple("苹果"));

        // 不能插入子类数据
        //plate.setItem(new SuperExtendT().new Apple());

        // 可以取出数据
        System.out.println(plate.getItem());


        // 下限通配符
        Plate<? super Fruit> plate2 = new SuperExtendT().new Plate<>(new SuperExtendT().new Fruit("水果"));

        // 插入数据
        plate2.setItem(new SuperExtendT().new Apple("苹果x"));

        // 取出数据
        System.out.println(plate2.getItem());
    }

}
