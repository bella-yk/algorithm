package programmers.exercise;

/**
 * 연습문제 > 자릿수 더하기
 */
public class Solution12931 {
    public static int solution(int n) {
        int answer = 0;

        for(char c : String.valueOf(n).toCharArray()) {
            answer += Integer.parseInt(String.valueOf(c));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123));
    }

}
