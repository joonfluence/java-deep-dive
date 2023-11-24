package org.grammar.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TcpIpServerChat {
    public static void main(String args[]) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            System.out.println(getTime()+"연결요청을 기다립니다.");
            serverSocket = new ServerSocket(7777);
            System.out.println("서버가 준비되었습니다.");
            // 서버소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다린다.
            // 클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성한다.
            socket = serverSocket.accept();
            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // main

    // 현재시간을 문자열로 반환하는 함수
    static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}

class Sender extends Thread {
    Socket socket;
    DataOutputStream out;
    String name;


    public Sender(Socket socket) {
        this.socket = socket;
        try {
            out = new DataOutputStream(socket.getOutputStream());
            name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
        } catch (Exception e){}
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        while(out != null){
            try {
                out.writeUTF(name + scanner.nextLine());
            } catch (IOException e){}
        }
    }
}

class Receiver extends Thread {
    Socket socket;
    DataInputStream in;


    public Receiver(Socket socket) {
        this.socket = socket;
        try {
            in = new DataInputStream(socket.getInputStream());
        } catch (Exception e){}
    }

    public void run(){
        while(in != null){
            try {
                System.out.println(in.readUTF());
            } catch (IOException e){}
        }
    }
}

