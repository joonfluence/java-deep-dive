package org.design_pattern.solid.contents;

public class Movie extends Contents{
    private int attendance;

    @Override
    public void view() {
        System.out.println("영화명 : " + this.getName());
        System.out.println("영화 접속 링크 : " + this.getViewUrl());
    }
}
