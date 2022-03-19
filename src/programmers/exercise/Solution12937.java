package programmers.exercise;

/**
 * 연습문제 > 짝수와 홀수
 */
public class Solution12937 {
    public static String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
