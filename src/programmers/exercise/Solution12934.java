package programmers.exercise;

/**
 * 연습문제 > 정수 제곱근 판별
 */
public class Solution12934 {
    public static long solution(long n) {
        Double sqrt = Math.sqrt(Double.valueOf(n));

        if(sqrt == sqrt.intValue()) {
            return (long)Math.pow(sqrt + 1, 2);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(9));
    }
}
