package org.design_pattern.solid.contents;

public class Webtoon extends Contents {
    private int viewerCount;
    @Override
    public void view() {
        System.out.println("웹툰명 : " + this.getName());
        System.out.println("웹툰 접속 링크 : " + this.getViewUrl());
    }
}
