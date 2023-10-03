package com.example;

public class App {
    public static void main(String[] args) {
        String ip = "localhost";
        int porta = 3000;
        ClientStr client = new ClientStr();
        client.connetti(ip, porta);
        client.comunica();
    }
}
