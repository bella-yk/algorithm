package programmers.exercise;

/**
 * 연습문제 > 콜라츠 추측
 */
public class Solution12943 {
    public static int solution(int num) {
        int answer = 0;
        long target = Long.valueOf(num);
        while (target != 1) {
            answer ++;
            if(target % 2 == 0) {
                target /= 2;
            } else {
                target = (target * 3) + 1;
            }
            if(answer == 500) {
                return -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}
