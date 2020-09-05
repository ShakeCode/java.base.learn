package com.java.learn.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class MyClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyClient myclient = new MyClient();
    }

    public MyClient() {
        try {
            Socket client = new Socket("192.168.1.103", 9999);

            //通过输出流向套接字对象写入数据，true,表示刷新
            PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
            pw.println("你好！我是客户端");

            //读取套接字socket中传递的数据
            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            BufferedReader br = new BufferedReader(isr);

            String response = br.readLine();
            System.out.println("我收到了服务端的消息：" + response);
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
