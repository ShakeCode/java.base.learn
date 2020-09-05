package com.java.learn.swing;

import java.awt.*;
import javax.swing.*;

public class ManagermentView extends JFrame {
    JPanel jp1, jp2, jp3;   //面板
    JLabel jlb1, jlb2;    //标签
    JButton jb1, jb2;     //按钮
    JTextField jf1, jf2;   //文本输入区域
    JPasswordField jpf;   //密码输入区域

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        ManagermentView test = new ManagermentView();
    }

    //定义构造函数
    public ManagermentView() {
        //创建组件
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jlb1 = new JLabel("用户名");
        jlb2 = new JLabel("密码  ");
        jb1 = new JButton("确定");
        jb2 = new JButton("取消");

        jf1 = new JTextField(10);    //区域长度
        jpf = new JPasswordField(10);

        //设置布局管理器
        this.setLayout(new GridLayout(3, 1));

        //添加组件
        jp1.add(jlb1);
        jp1.add(jf1);

        jp2.add(jlb2);
        jp2.add(jpf);

        jp3.add(jb1);
        jp3.add(jb2);
        //加入到窗体
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        //设置窗体属性
        this.setSize(300, 200);
        this.setLocation(300, 200);
        this.setVisible(true);

    }
}
