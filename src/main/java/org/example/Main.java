package org.example;

public class Main {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        String d = new String("hello");

        System.out.println(a == b);
        System.out.println(b == c);
        b.intern();
        System.out.println(c == d);
    }
}