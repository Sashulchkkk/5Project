package ru.netology.services;

public class Main {
    public static void main(String[] args) {

        Services server = new Services();

        int out = server.calculate(10000, 3000, 20000);
        System.out.println(out);
    }
}