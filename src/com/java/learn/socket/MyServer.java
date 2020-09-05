package com.java.learn.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServer {

    /**
     * 单双工型通信
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyServer myserver = new MyServer();
    }


    public MyServer() {
        try {
            ServerSocket server = new ServerSocket(9999);    //创建监听9999端口的服务器套接字
            System.out.println("服务器已启动！我在9999端口监听~~~");
            Socket socket = server.accept();    //等待客户端链接，返回一个套接字，专门与客户端套接字通信

            //server.getInetAddress(); // Returns the local address of this server socket

            //当客户端与服务器链接成功，代码继续往下走，打印出“你好”
//			System.out.println("你好！");

            //读取套接字socket中传递的数据
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader br = new BufferedReader(isr);

            String info = br.readLine();
            System.out.println("服务器收到了：" + info);

            //写消息给输入客户端的输出流
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println("你好，我是服务器");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
