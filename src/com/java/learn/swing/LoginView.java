package com.java.learn.swing;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame{

    JPanel jp1, jp2, jp3;   //面板
    JLabel jlb1, jlb2;    //标签
    JButton jb1, jb2;     //按钮
    JCheckBox jcb1, jcb2, jcb3;    //复选框
    JRadioButton jrb1, jrb2;   //单选框
    ButtonGroup bg;

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        LoginView test = new LoginView();
    }

    //定义构造函数
    public LoginView() {
        //创建组件
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jlb1 = new JLabel("你喜欢的运动");
        jlb2 = new JLabel("你的性别 ");
        jb1 = new JButton("注册用户");
        jb2 = new JButton("取消注册");

        jcb1 = new JCheckBox("足球");
        jcb2 = new JCheckBox("篮球");
        jcb3 = new JCheckBox("网球");

        jrb1 = new JRadioButton("男");
        jrb2 = new JRadioButton("女");
        //一定要将jrb1,jrb2放入同一个ButtonGroup
        ButtonGroup bg = new ButtonGroup();

        bg.add(jrb1);
        bg.add(jrb2);

        //设置布局管理
        this.setLayout(new GridLayout(3, 1));  //定义3x1的网格布局

        //添加组件
        jp1.add(jlb1);
        jp1.add(jcb1);
        jp1.add(jcb2);
        jp1.add(jcb3);

        jp2.add(jlb2);
        jp2.add(jrb1);
        jp2.add(jrb2);

        jp3.add(jb1);
        jp3.add(jb2);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        //设置窗体属性
        this.setSize(300, 200);
        this.setLocation(300, 200);
        this.setVisible(true);
    }
}
