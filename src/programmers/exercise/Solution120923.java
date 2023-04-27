package programmers.exercise;

import java.util.Arrays;

/**
 * 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
 * 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때,
 * 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
 */
public class Solution120923 {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

        int mid = 0;

        if (num == total) {
          mid = num % 2 == 0 ? num / 2 : ((num / 2) + 1);
          for (int i = 0; i < num ; i++) {
            answer[num - i -1] = mid - i;
          }
        } else if(total  % num == 0){
          mid = total / num;

          for (int i = 0; i <= num / 2 ; i++) {
            answer[num/2 - i] = mid - i;
          }

          for (int i = 0; i <= num / 2 ; i++) {
            answer[num/2 + i] = mid + i;
          }

        } else {
          mid = total / num;
          int mid2 = total / num + 1;

          int target = total % num;

          for (int i = target - 1; i >= 0; i--) {
            answer[i] = mid;
            mid --;
          }

          for (int i = target; i < num ; i++) {
            answer[i] = mid2 ++;
          }

        }

        return answer;
    }

    public static void main(String[] args) {
//      Arrays.stream(solution(5, 5)).forEach(n -> System.out.println(n));
      Arrays.stream(solution(4, 14)).forEach(n -> System.out.println(n));
    }

}
