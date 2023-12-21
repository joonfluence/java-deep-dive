package org.design_pattern.singleton.v2;

public class Printer {
    private static Printer printer = new Printer();
    private volatile int counter = 0;

    public Printer() {
    }

    public static Printer getPrinter(){
        return printer;
    }

    public void print(String str){
        synchronized (this){
            counter++;
            System.out.println(str + counter);
        }
    }
}
