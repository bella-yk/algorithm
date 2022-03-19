package programmers.exercise;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 연습문제 > 제일 작은 수 제거하기
 */
public class Solution12935 {
    public static int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[]{-1};
        }
        OptionalInt min = Arrays.stream(arr).min();
        return Arrays.stream(arr).filter(num -> num != min.getAsInt()).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(solution(arr));
    }
}
