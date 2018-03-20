package com.windsing02;

public class MyTest {

    public static void case01() throws Exception {
        if (1 == 1) {
            System.out.println("OK");
            throw new Exception(String.valueOf(Exception.class));
        }
        System.out.println("here");
    }

    public static void main(String[] args) throws Exception {
        case01();

    }
}
