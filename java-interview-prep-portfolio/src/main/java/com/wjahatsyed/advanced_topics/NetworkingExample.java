package com.wjahatsyed.advanced_topics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkingExample {
    public static void main(String[] args) {
        new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(5000)) {
                System.out.println("Server started...");
                Socket clientSocket = serverSocket.accept();
                try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                    System.out.println("Received from client: " + in.readLine());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        try (Socket socket = new Socket("localhost", 5000);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println("Hello from Client!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
