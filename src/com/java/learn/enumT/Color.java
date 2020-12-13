package com.java.learn.enumT;

public enum Color {

    RED, BLANK, YELLOW;


    public static void main(String[] args) {
        Color color = Color.RED;
        switch (color) {
            case BLANK:
                System.out.println("黑色");
                break;
            case RED:
                System.out.println("红色");
                break;
            default:
                break;
        }
    }
}
