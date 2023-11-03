package org.solid;

import lombok.Getter;
import lombok.Setter;
import org.solid.contents.Contents;
import org.solid.payment.Payable;

@Setter
@Getter
public class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void evaluate(Contents contents, double rate){
        System.out.println("컨텐츠명 : " + contents.getName());
        System.out.println("점수 : " + rate);
    }
    public void comment(Contents contents, String comment){
        System.out.println("컨텐츠명 : " + contents.getName());
        System.out.println("커멘트 : " + comment);
    }
    public void watch(Contents contents){
        System.out.println("컨텐츠명 : " + contents.getName());
        System.out.println("컨텐츠 영상 URL : " + contents.getViewUrl());
    }

    public String search(Contents contents){
        System.out.println("찾을 컨텐츠명 : " + contents.getName());
        return contents.getViewUrl();
    }

    public void reserve(Contents contents){
        System.out.println("예약할 컨텐츠명 : " + contents.getName());
        System.out.println("예약 컨텐츠 영상 URL : " + contents.getViewUrl());
    }

    public void pay(Payable payable, Contents contents){
        System.out.println("구매할 컨텐츠명 : " + contents.getName());
        System.out.println("구매 컨텐츠 영상 URL : " + contents.getViewUrl());
        payable.pay();
    }
}
