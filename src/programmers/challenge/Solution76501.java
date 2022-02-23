package programmers.challenge;

/**
 * 월간 코드 챌린지 시즌2 > 음양 더하기
 */
public class Solution76501 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++) {
            int signNum = signs[i] ? 1 : -1;
            answer += absolutes[i] * signNum;
        }
        return answer;
    }

    public static void main(String[] args) {
//        int[] absolutes = {4, 7, 12};
        int[] absolutes = {1, 2, 3};
        boolean[] signs = {false, false, true};

        System.out.println(solution(absolutes, signs));
    }
}
