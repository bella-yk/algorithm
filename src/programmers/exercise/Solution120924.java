package programmers.exercise;

/**
 * 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
 */
public class Solution120924 {
  public static int solution(int[] common) {
      int answer = 0;
      int n1 = common[1] - common[0];
      int n2 = common[2] - common[1];

      if(n1 == n2) {
        return common[common.length-1] + n1;
      } else {
        return common[common.length-1] *(common[1] / common[0]);
      }
    }

    public static void main(String[] args) {
      int[] common = {2, 4, 8};
      System.out.println(solution(common));
    }

}
