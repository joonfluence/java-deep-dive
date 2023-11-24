package org.design_pattern.solid.payment;

public class NaverPay implements Payable{
    @Override
    public void pay() {
        System.out.println("네이버페이로 결제합니다");
    }
}
