package hackerrank;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int n : arr) {
            if(n == 0) {
                zero ++;
            } else if (n > 0) {
                positive ++;
            } else {
                negative ++;
            }
        }

        System.out.println(String.format("%.6f", (double) positive/arr.size()));
        System.out.println(String.format("%.6f", (double) negative/arr.size()));
        System.out.println(String.format("%.6f", (double) zero/arr.size()));
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);

    }
}
