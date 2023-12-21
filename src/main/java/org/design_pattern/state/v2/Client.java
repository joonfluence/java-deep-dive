package org.design_pattern.state.v2;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        light.offButtonPushed();
        light.onButtonPushed();
        light.offButtonPushed();
    }
}
