package programmers.exercise;

/**
 * 연습문제 > 하샤드 수
 */
public class Solution12947 {
    public static boolean solution(int x) {
        int num = 0;
        for(char c : String.valueOf(x).toCharArray()) {
            num += Integer.parseInt(String.valueOf(c));
        }

        if(x % num == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(11));
    }
}
