package codility;

import java.util.Arrays;

/**
 * An array A consisting of N different integers is given.
 * The array contains integers in the range [1..(N + 1)],
 * which means that exactly one element is missing.
 */
public class PermMissingElem {
    public static int solution(int[] A) {
        Arrays.sort(A);

        Integer missing = null;

        for (int i=0; i< A.length; i++) {
            int number = i+1;
            if(A[i] != number) {
                System.out.println(number);
                missing = number ;
                break;
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        System.out.println(solution(A));

    }
}
