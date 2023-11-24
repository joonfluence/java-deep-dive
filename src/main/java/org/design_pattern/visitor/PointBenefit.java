package org.design_pattern.visitor;

public class PointBenefit implements Benefit {
    @Override
    public void getBenefit(GoldMember member) {
        System.out.println("Point for Gold Member");
    }

    @Override
    public void getBenefit(VipMember member) {
        System.out.println("Point for Vip Member");
    }
}
