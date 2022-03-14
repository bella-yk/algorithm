package programmers.exercise;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 연습문제 > 문자열 내 마음대로 정렬하기
 */
public class Solution12915 {
    public static String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.charAt(n) - s2.charAt(n) == 0) {
                    return s1.compareTo(s2);
                }
                return s1.charAt(n) - s2.charAt(n);
            }
        });
        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        System.out.println(solution(strings, n));
    }
}
