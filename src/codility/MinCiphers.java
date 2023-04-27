package codility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 정수 N이 주어졌을 때 개별 자릿수의 합이 N이 되는 가장작은 정수를 반환하는 솔루션
 *
 * N이 16일 경우 79를 반환,
 */
public class MinCiphers {
    public static int solution(int N) {

        List<String> list = new ArrayList();

        while ( N > 9) {
            list.add("9");
            N = N - 9;
        }

        list.add(Integer.toString(N));

        list.sort(Comparator.naturalOrder());
        return Integer.parseInt(String.join("", list));

    }

    public static void main(String[] args) {
        int N = 19;
        System.out.println(solution(N));

    }
}
