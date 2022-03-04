package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.naturalOrder());
        int[] result = new int[arr.get(arr.size()-1) + 1];

        for(int n : arr) {
            result[n] = result[n]+1;
        }

        return Arrays.stream(result).boxed().collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 3, 2, 4);
        System.out.println(countingSort(arr));
    }
}
