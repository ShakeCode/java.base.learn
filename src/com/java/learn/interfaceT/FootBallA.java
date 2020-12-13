package com.java.learn.interfaceT;

public class FootBallA implements FootBall.BallC {


    @Override
    public void run() {
        System.out.println("run ...");
    }

    public static void main(String[] args) {
        new FootBallA().run();
    }
}
