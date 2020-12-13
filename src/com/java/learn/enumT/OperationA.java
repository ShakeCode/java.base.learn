package com.java.learn.enumT;

public enum OperationA {
    PLUS, MINUS, TIMES, DIVIDE;

    public double operate(double num1, double num2) {
        switch (this) {
            case PLUS:
                return num1 + num2;
            case MINUS:
                return num1 - num2;
            case TIMES:
                return num1 * num2;
            case DIVIDE:
                return num1 / num2;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(OperationA.DIVIDE.operate(1,2));
    }
}
