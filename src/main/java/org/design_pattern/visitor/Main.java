package org.design_pattern.visitor;

/*

예제 : https://thecodinglog.github.io/design/2019/10/29/visitor-pattern.html https://alkhwa-113.tistory.com/entry/%EB%94%94%EC%8A%A4%ED%8C%A8%EC%B9%98-%EB%8B%A4%EC%9D%B4%EB%82%98%EB%AF%B9-%EB%94%94%EC%8A%A4%ED%8C%A8%EC%B9%98-%EB%8D%94%EB%B8%94-%EB%94%94%EC%8A%A4%ED%8C%A8%EC%B9%98

비지터 패턴 : 더블 디스패치를 범용적으로 쓰기 위한 디자인 패턴, 실제 로직을 가지고 있는 객체(Visitor)가 로직을 적용할 객체(Element)를 방문하면서 실행하는 패턴이다.
동적(다이내믹) 디스패치 : 런타임에 어떤 메소드를 호출할 지 결정되는 것
더블 디스패치 : 동적 디스패치를 두 번 연속으로 하는 것

 */
public class Main {
    public static void main(String[] args) {
        GoldMember goldMember = new GoldMember();
        VipMember vipMember = new VipMember();
        Benefit pointBenefit = new PointBenefit();
        Benefit discountBenefit = new DiscountBenefit();
        Benefit freeRentBenefit = new FreeRentBenefit();

        goldMember.getBenefit(pointBenefit);
        vipMember.getBenefit(pointBenefit);
        goldMember.getBenefit(discountBenefit);
        vipMember.getBenefit(discountBenefit);
        vipMember.getBenefit(freeRentBenefit);
        vipMember.getBenefit(freeRentBenefit);
    }
}
