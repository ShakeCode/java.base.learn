package com.java.learn.enumT;

/*4.values()方法和valueOf(String name)方法是编译器生成的static方法，因此从前面的分析中，在Enum类中并没出现values()方法，但valueOf()方法还是有出现的，只不过编译器生成的valueOf()方法需传递一个name参数，而Enum自带的静态方法valueOf()则需要传递两个方法，从前面反编译后的代码可以看出，编译器生成的valueOf方法最终还是调用了Enum类的valueOf方法。*/
public interface Food {

    enum Coffee implements Food{
        BLACK_COFFEE,DECAF_COFFEE,LATTE,CAPPUCCINO
    }
    enum Dessert implements Food{
        FRUIT, CAKE, GELATO
    }
    public  static void main(String[] args) {
        for (Dessert dessertEnum : Food.Dessert.values()) {
            System.out.print(dessertEnum + "  ");
        }
        System.out.println();
        for (Coffee coffee : Food.Coffee.values()) {
            System.out.print(coffee + "  ");
        }
        System.out.println();
        //还有就是个“多态”的功能吧，
        Food food = Food.Dessert.CAKE;
        System.out.println(food);
        food = Coffee.BLACK_COFFEE;
        System.out.println(food);
    }
}
