package codility;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q3 {
    public static int[] solution(int[] A, int K) {

        int[] gapArr = new int[A.length-1];

        for(int i=0; i<A.length-1; i++) {
            int gap = Math.abs(A[i+1]-A[i]);
            gapArr[i] = gap;
        }

        int max = 0;
        int maxPoint = 0;
        for (int i=0; i<A.length-K; i++) {
            int sum = 0;

            for(int j=0; j < K; j++) {
                sum += gapArr[i+j];
            }

            if (max < sum) {
                max = sum;
                maxPoint = i;
            }

        }

        int[] front = Arrays.copyOfRange(A, 0, maxPoint+1);
        int[] back = Arrays.copyOfRange(A, maxPoint + K + 1, A.length);

        return IntStream.concat(IntStream.of(front), IntStream.of(back)).toArray();
    }

    public static void main(String[] args) {
//        int[] A = {5, 3, 6, 1, 3};
        int[] A = {8, 8, 4, 3};
//        int[] A = {3, 5, 1, 3, 9, 8};
        int K = 4;
        System.out.println(solution(A, K));

    }
}
