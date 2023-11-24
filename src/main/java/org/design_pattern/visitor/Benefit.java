package org.design_pattern.visitor;

public interface Benefit {
    void getBenefit(GoldMember member);
    void getBenefit(VipMember member);
}
