package programmers.sort;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 정렬 > 가장 큰 수
 */
public class Solution42746 {
    public static String solution(int[] numbers) {
        // test case :9 => 00000 의 배열일 경우 0 을 리턴해야함!
        if(Arrays.stream(numbers).sum() == 0) {
            return "0";
        }
        String[] strings = Arrays.stream(numbers).mapToObj(Integer::toString).toArray(String[]::new);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });

        return String.join("", strings);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};

        System.out.printf(solution(numbers));
    }
}
