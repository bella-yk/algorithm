package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int size = arr.size()-1;
        int left = 0;
        int right = 0;
        for(int i=0; i<=size; i++) {
            left += arr.get(i).get(i);
            right += arr.get(size-i).get(i);
        }

        return Math.abs(left - right);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(9, 8, 9));
        System.out.println(diagonalDifference(arr));
    }
}
