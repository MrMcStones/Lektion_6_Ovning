package com.rasmus.demo;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Inside TRY");
            System.out.println(2/0);
        } catch (Exception error) {
            error.printStackTrace();
            System.out.println("Catch started");
        }
    }
}

