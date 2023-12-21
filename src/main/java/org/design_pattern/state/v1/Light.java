package org.design_pattern.state.v1;

public class Light {
    private static int ON = 0;
    private static int OFF = 1;
    private int state;


    public Light() {
        this.state = OFF;
    }

    public void onButtonPushed(){
        if (state == ON){
            System.out.println("반응 없음");
        } else {
            System.out.println("Light On!");
            state = ON;
        }
    }

    public void offButtonPushed(){
        if (state == OFF){
            System.out.println("반응 없음");
        } else {
            System.out.println("Light Off!");
            state = OFF;
        }
    }
}
