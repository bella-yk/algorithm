package hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMedian {
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        int mid = arr.size()/2;
        arr.sort(Comparator.naturalOrder());
        return arr.get(mid);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5, 3, 1, 2, 4);
        System.out.println(findMedian(arr));
    }
}
