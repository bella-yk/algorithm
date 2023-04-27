package codility;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros
 * that is surrounded by ones at both ends in the binary representation of N.
 *
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 * The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
 * The number 20 has binary representation 10100 and contains one binary gap of length 1.
 * The number 15 has binary representation 1111 and has no binary gaps.
 * The number 32 has binary representation 100000 and has no binary gaps.
 */
public class DemoU7BV2V {
    public static int solution(int[] A) {
        int result = 1;

        Set<Integer> set = new HashSet<>();
        for(int a : A) {
            if(a > 0) {
                set.add(a);
            }
        }

        for(int i=1; i<=set.size()+1; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 2,3};
//        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));

    }
}
