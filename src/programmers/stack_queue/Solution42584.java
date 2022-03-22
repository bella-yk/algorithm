package programmers.stack_queue;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * 스택/큐 > 주식가격
 */
public class Solution42584 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i=0; i<prices.length; i++) {
            int start = i + 1;
            int target = prices[i];
            OptionalInt second = IntStream.range(start, prices.length)
                    .filter(num -> {
                        return target > prices[num];
                    }).findFirst();

            if(second.isPresent()) {
               answer[i] = second.getAsInt() - i;
            } else {
                answer[i] = prices.length - start;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] price = {1, 2, 3, 2, 3};
        System.out.println(solution(price));
    }
}
