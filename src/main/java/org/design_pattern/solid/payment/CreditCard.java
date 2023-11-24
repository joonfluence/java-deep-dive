package org.design_pattern.solid.payment;

public class CreditCard implements Payable {
    @Override
    public void pay() {
        System.out.println("신용카드로 결제합니다");
    }
}
