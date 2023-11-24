package org.design_pattern.visitor;

public class BenefitImpl {
    public void point(Member member) {
        if(member instanceof GoldMember){
            System.out.println("Point for Gold Member");
        } else if (member instanceof VipMember){
            System.out.println("Point for VIP Member");
        }
    }

    public void discount(Member member) {
        if(member instanceof GoldMember){
            System.out.println("Discount for Gold Member");
        } else if (member instanceof VipMember){
            System.out.println("Discount for VIP Member");
        }
    }
}
