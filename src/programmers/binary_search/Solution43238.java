package programmers.binary_search;

import java.util.Arrays;

/**
 * 이분탐색 > 입국심사
 */
public class Solution43238 {
    public static long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);

        long min = 0;
        long max = (long) n * times[times.length - 1];

        while (min <= max) {
            long mid = (min + max) / 2;
            long sum = 0;

            for(int i=0; i<times.length; i++) {
                sum += mid / times[i];
            }

            if(sum < n) {
                min = min + 1;
            } else {
                max = max - 1;
                answer = Math.min(answer, mid);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};

        System.out.printf(Long.toString(solution(6, times)));
    }
}
