package com.java.learn.enumT;

public enum  Operation {

    PLUS {
        @Override
        double operate(double num1, double num2) {
            return num1 + num2;
        }
    },
    MINUS {
        @Override
        double operate(double num1, double num2) {
            return num1 - num2;
        }
    },
    TIMES {
        @Override
        double operate(double num1, double num2) {
            return num1 * num2;
        }
    },
    DIVIDE {
        @Override
        double operate(double num1, double num2) {
            return num1 / num2;
        }
    };
    // 须放在最后面
    abstract double operate(double num1, double num2);

    public static void main(String[] args) {
        System.out.println(Operation.DIVIDE.operate(4,2));
    }
}
