package programmers.challenge;

import java.util.Arrays;

/**
 * 월간 코드 챌린지 시즌3 > 없는 숫자 더하기
 */
public class Solution86051 {
    public static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        int index = 0;
        for(int i=0; i<=9; i++) {
            if(i > numbers[numbers.length-1] || i != numbers[index]) {
                answer += i;
            } else {
                index ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution(numbers));
    }
}
