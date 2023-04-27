package codility;

public class Q4 {
    public static int solution(int[] A, int K) {

        int[] binArray = new int[A.length];

        for (int i=0; i<A.length; i++) {
            String binaryString = Integer.toBinaryString(A[i]);
            int binary = Integer.parseInt(binaryString, 2);

            binArray[i] = binary;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 8};
        int K = 2;
        System.out.println(solution(A, K));

    }
}
