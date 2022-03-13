package programmers.challenge;

/**
 * 월간 코드 챌린지 시즌3 > 나머지가 1이 되는 수 찾기
 */
public class Solution87389 {
    public static int solution(int n) {
        int answer = 1;

        while (true) {
            if(n%answer == 1) {
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
}
