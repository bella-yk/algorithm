package hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.naturalOrder());

        // 정수 overflow 이슈가 있음! 힌트 또는 문제 자세히 읽을것!!
        long max = 0;
        long min = 0;
        for(int i=0; i<arr.size(); i++) {
            if(i != arr.size() - 1) {
                min += arr.get(i);
            }

            if(i != 0) {
                max += arr.get(i);
            }
        }

        System.out.println(String.format("%d %d", min, max));
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        miniMaxSum(arr);
    }
}
