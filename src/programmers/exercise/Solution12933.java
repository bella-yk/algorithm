package programmers.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 연습문제 > 정수 내림차순으로 배치하기
 */
public class Solution12933 {

    public static long solution(long n) {
        List<String> list = new ArrayList<>();
        String s = String.valueOf(n);
        for(char c : s.toCharArray()) {
            list.add(String.valueOf(c));
        }
        list.sort(Comparator.reverseOrder());

        return Long.parseLong(list.stream().collect(Collectors.joining()));
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
    
}
