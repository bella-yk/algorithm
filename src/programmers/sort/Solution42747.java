package programmers.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 정렬 > H-Index
 * 어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
 *
 * 참고가 많이 됬던 h-index 설명! https://www.ibric.org/myboard/read.php?Board=news&id=270333
 * 역순으로 정렬 후 논문의 갯수와, 인용갯수가 같거나 작아질 때!
 */
public class Solution42747 {
    public static int solution(int[] citations) {
        List<Integer> list = Arrays.stream(citations).boxed().collect(Collectors.toList());
        list.sort(Comparator.reverseOrder());

        for(int i=0; i<list.size(); i++) {
            if(list.get(i) <= i) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
//        int[] citations = {3, 0, 6, 1, 5};
//        int[] citations = {10, 8, 5, 4, 3}; // => 4
//        int[] citations = {25, 8, 5, 3, 3}; // => 3
        int[] citations = {3, 4, 5, 11, 15, 16, 17, 18, 19, 20}; // => 6
        System.out.println(solution(citations));
    }
}
