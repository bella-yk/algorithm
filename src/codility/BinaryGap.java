package codility;

import java.util.ArrayList;
import java.util.List;

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
public class BinaryGap {
    public static int solution(Integer N) {
        String binary = Integer.toBinaryString(N);
        List<Integer> list = new ArrayList<>();

        System.out.println(binary);
        int maxGap = 0;

        for(int i=0; i<binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                list.add(i);

                if(i > 0) {
                    int gap = i - list.get(list.size()-2);
                    maxGap = gap > maxGap ? gap : maxGap;
                }
            }
        }

        System.out.println(list);


        return maxGap-1;
    }

    public static void main(String[] args) {

        Integer N = 1041;
        System.out.println(solution(N));

    }
}
