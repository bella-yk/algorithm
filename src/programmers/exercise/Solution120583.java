package programmers.exercise;

import java.util.Arrays;

public class Solution120583 {
  public static int solution(int[] array, int n) {
      long count = Arrays.stream(array).filter(num -> num == n).count();

      return (int) count;
    }

    public static void main(String[] args) {
      int[] array = {1, 1, 2, 3, 4, 5};
      System.out.println(solution(array, 1));
    }

}
