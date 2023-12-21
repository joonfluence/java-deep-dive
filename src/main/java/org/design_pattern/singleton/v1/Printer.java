package org.design_pattern.singleton.v1;

public class Printer {
    private static Printer printer = null;

    public Printer() {
    }

    public static Printer getPrinter(){
        if (printer == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {}
            printer = new Printer();
        }
        return printer;
    }

    public void print(String str){
        System.out.println("str = " + str);
    }
}
