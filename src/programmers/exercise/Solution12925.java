package programmers.exercise;

/**
 * 연습문제 > 문자열을 정수로 바꾸기
 */
public class Solution12925 {
    public static int solution(String s) {
        if(s.charAt(0) == '+') {
            return Integer.parseInt(s.substring(1));
        } else {
            return Integer.parseInt(s.substring(1)) * -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("+1234"));
    }
}
