package programmers.etc;

import java.util.Arrays;
import java.util.List;

public class NX03 {
    public static int largestSubgrid(List<List<Integer>> grid, int maxSum) {
        // Write your code here
        int answer = 0;

        int min = 0;
        for(int i=0; i<grid.size(); i++) {
            int sum = 0;
            int max = 0;
            for(int j=0; j<grid.size()-i; j++) {
                for (int k = 0; k < j + 1; k++) {
                    sum += grid.get(j).get(k);
                    System.out.println("i:" + i + "  sum:" + sum);
                }

                if (max < sum) {
                    max = sum;
                }
            }
            if (min == 0 && maxSum < max) {
                return i;
            } else if (min <= maxSum && maxSum < max) {
                return i;
            } else if (grid.size() - 1 == i && min <= maxSum && maxSum < max) {
                return i;
            }
            sum = 0;
            min = max;
        }


        return answer;
    }

    public static void main(String[] args) {
        List<List<Integer>> grid = Arrays.asList(Arrays.asList(1, 1, 1),
                Arrays.asList(1, 1, 1),
                Arrays.asList(1, 1, 1));

        System.out.println(largestSubgrid(grid, 4));
    }
}
