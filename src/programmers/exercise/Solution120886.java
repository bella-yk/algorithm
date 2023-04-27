package programmers.exercise;

import java.util.Arrays;

/**
 * 연습문제 > 문자열을 정수로 바꾸기
 */
public class Solution120886 {
    public static int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        return String.valueOf(beforeArr).equals(String.valueOf(afterArr)) ? 1 : 0;

    }

    public static void main(String[] args) {
        System.out.println(solution("allpe", "apple"));
    }
}
