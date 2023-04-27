package programmers.exercise;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 연습문제 > 컨트롤 제트
 */
public class Solution120853 {
    public static int solution(String s) {
        int answer = 0;

        String[] arr = s.split(" ");
        for (int i=0; i <  arr.length; i++) {
            if (arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i-1]);
            } else {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("1 2 Z 3"));
    }
}
