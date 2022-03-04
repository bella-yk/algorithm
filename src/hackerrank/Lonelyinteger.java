package hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class Lonelyinteger {

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        List<Integer> set = a.stream().distinct().collect(Collectors.toList());
        set.removeIf(num -> a.stream().filter(n -> n == num).count() > 1);
        return set.get(0);

    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 1));
        System.out.println(lonelyinteger(a));
    }
}
