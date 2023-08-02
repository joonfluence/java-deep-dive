package org.algorithm;

public class Main {
    public static void main(String[] args){
        int sum = greedy(5800);
        System.out.println(sum);
    }

    private static int greedy(int money) {
        int[] coins = {500, 100, 50, 10};
        int count = 0;

        // 가장 큰 단위 수인 500부터 차례대로 나누면
        // 더 이상 나눌 수 없을 때까지
        // 1. money / coins[0]
        for (int i = 0; i < coins.length; i++) {
            int divideNum = coins[i];
            int adder = (int) Math.floor(money / divideNum);
            money = money % divideNum;

            System.out.println("divideNum, adder >>>> " + divideNum + ":" + adder);
            count += adder;

            if (money % divideNum == 0){
                break;
            }
        }

        return count;
    }
}
