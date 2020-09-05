package com.java.learn.swing;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class RunningBall extends JFrame {

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        RunningBall test = new RunningBall();
    }

    //构造函数
    public RunningBall() {

        mypanel mp = new mypanel();
        //添加面板
        this.add(mp);
        //添加监听对象
        this.addKeyListener(mp);

        //设置窗体属性
        this.setSize(300, 200);
        this.setLocation(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class mypanel extends JPanel implements KeyListener {
        int x;
        int y;

        public void paint(Graphics g) {
            super.paint(g);
            g.fillOval(x, y, 20, 20);
        }

        @Override    //键盘按下
        public void keyPressed(KeyEvent arg0) {
            // TODO 自动生成的方法存根
            if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
                y += 2;
            } else if (arg0.getKeyCode() == KeyEvent.VK_UP) {
                y -= 2;
            } else if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
                x += 2;
            } else if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
                x -= 2;
            }
            //调用重新绘图方法（没写则不会显示移动的圆）
            this.repaint();
        }

        @Override    //键盘松开
        public void keyReleased(KeyEvent arg0) {
            // TODO 自动生成的方法存根

        }

        @Override    //键盘值输出
        public void keyTyped(KeyEvent arg0) {
            // TODO 自动生成的方法存根

        }
    }

}
