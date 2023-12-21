package org.design_pattern.singleton.v3;

public class Printer {
    private static int counter = 0;

    public synchronized static void print(String str){
        counter++;
        System.out.println(str + counter);
    }
}
