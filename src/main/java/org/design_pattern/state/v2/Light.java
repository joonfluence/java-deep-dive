package org.design_pattern.state.v2;

interface State {
    public void onButtonPushed(Light light);
    public void offButtonPushed(Light light);
}

class ON implements State {
    private static ON on = new ON();
    private ON(){}

    public static ON getInstance(){
        return on;
    }
    @Override
    public void onButtonPushed(Light light) {
        System.out.println("반응 없음");
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("Light Off!");
        light.setState(OFF.getInstance());
    }
}

class OFF implements State {
    private static OFF off = new OFF();
    private OFF(){}

    public static OFF getInstance(){
        return off;
    }

    @Override
    public void onButtonPushed(Light light) {
        System.out.println("반응 없음");
        light.setState(ON.getInstance());
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("Light Off!");
    }
}

public class Light {
    private State state;


    public Light() {
        this.state = OFF.getInstance();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void onButtonPushed(){
        state.onButtonPushed(this);
    }

    public void offButtonPushed(){
        state.offButtonPushed(this);
    }
}
