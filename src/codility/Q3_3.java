package codility;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q3_3 {
    public static int[] solution(int[] A, int K) {

        Map<Integer, List<Integer>> b = new HashMap<>();

        IntStream.range(0, A.length).forEach(n -> {
            List <Integer> integers = Arrays.stream(A).boxed().collect(Collectors.toList());
            List<Integer> num = new ArrayList<>();
            if (n+K <= A.length) {
                IntStream.range(n, n+K).forEach(nn -> {
                    num.add(A[nn]);
                });
            };
            b.put(n, integers);
        });

        return A;
    }

    public static void main(String[] args) {
//        int[] A = {5, 3, 6, 1, 3};
//        int[] A = {8, 8, 4, 3};
        int[] A = {3, 5, 1, 3, 9, 8};
        int K = 4;
        System.out.println(solution(A, K));

    }
}
