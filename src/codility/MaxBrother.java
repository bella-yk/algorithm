package codility;

import java.util.Arrays;
import java.util.Collections;

/**
 * 정수 N의 자릿수 배열로 얻을수 있는 숫자들의 조합 중 가장 큰 숫자를 구하세요.
 */
public class MaxBrother {
    public static int solution(int N) {

        String number = Integer.toString(N);
        String[] numArr = new String[number.length()];

        for(int i=0; i<number.length(); i++) {
            numArr[i] = Character.toString(number.charAt(i));
        }

        Arrays.sort(numArr, Collections.reverseOrder());

        return Integer.parseInt(String.join("", numArr));
    }

    public static void main(String[] args) {

        Integer N = 335;
        System.out.println(solution(N));

    }
}
