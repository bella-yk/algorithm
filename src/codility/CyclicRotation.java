package codility;

/**
 * An array A consisting of N integers is given.
 * Rotation of the array means that each element is shifted right by one index,
 * and the last element of the array is moved to the first place.
 * For example, the rotation of array
 * A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
 * (elements are shifted right by one index and 6 is moved to the first place).
 *
 * The goal is to rotate array A K times;
 * that is, each element of A will be shifted to the right K times.
 */
public class CyclicRotation {
    public static int[] solution(int[] A, Integer K) {
        int size = A.length;
        int[] result = A;

        if(A.length == K) {
            return A;
        }

        int count=0;
        while (count < K) {
            result = rotation(result, size);
            count++;
        }
        return result;
    }

    private static int[] rotation(int[] Arr, int size) {
        int[] result = new int[size];
        result[0] = Arr[Arr.length-1];

        for (int i=1; i<size; i++) {
            result[i] = Arr[i-1];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4};
        System.out.println(solution(A, 4));

    }
}
