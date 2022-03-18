package programmers.exercise;

/**
 * 연습문제 > x만큼 간격이 있는 n개의 숫자
 */
public class Solution12954 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = (long)x;
        long sum = x;
        for(int i=1; i<n; i++) {
            sum += x;
            answer[i] = (long)sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(-4, 2));
    }
}
