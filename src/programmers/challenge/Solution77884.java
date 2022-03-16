package programmers.challenge;

/**
 * 월간 코드 챌린지 시즌2 > 약수의 개수와 덧셈
 */
public class Solution77884 {
    public static int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++) {
            int count = i == 1 ? 1 : 2;
            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    count ++;
                }
            }

            if(count % 2 == 0) {
                answer += i;
            } else {

                answer -= i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 2));
    }
}
