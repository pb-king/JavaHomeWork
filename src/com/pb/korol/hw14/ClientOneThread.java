package com.pb.korol.hw14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientOneThread {
    public static void main(String[] args) throws Exception {
        int portNumber = 1777;
        Socket socket = new Socket("127.0.0.1", portNumber);
        System.out.println("Client is started");
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        pw.println("Тестовая строка для передачи");

        String str;

        while ((str = br.readLine()) != null) {
            if (str.equals("exit")) {
                break;
            }
            System.out.println(str);
        }

        br.close();
        pw.close();
        socket.close();
    }
}
