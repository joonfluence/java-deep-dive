package org.design_pattern.solid.contents;

public class TvContents extends Contents {
    private double viewRating;
    private boolean isOnAir;
    @Override
    public void view() {
        System.out.println("TV 컨텐츠명 : " + this.getName());
        System.out.println("컨텐츠 접속 링크 : " + this.getViewUrl());
    }
}
