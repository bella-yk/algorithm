package programmers.exercise;

/**
 * 위클리 챌린지 > 부족한 금액 계산하기
 */
public class Solution82612 {
    public static long solution(int price, int money, int count) {
        long priceSum = 0;
        for(int i=1; i<=count; i++) {
            priceSum += price * i;
        }
        return priceSum < money ? 0 : priceSum - money;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}
