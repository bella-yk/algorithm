package hackerrank;

import java.util.Arrays;
import java.util.List;

public class FlippingMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int mid = matrix.size()/2;

        int max = 0;
        int maxRow = 0;
        for(int i=0; i<matrix.size(); i++) {
            int sum = 0;
        }
        return 0;

    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = Arrays.asList(Arrays.asList(112, 42, 83, 119),
                Arrays.asList(56, 125, 56, 49),
                Arrays.asList(15, 78, 101, 43),
                Arrays.asList(62, 98, 114, 108));

        System.out.println(flippingMatrix(matrix));
    }
}
