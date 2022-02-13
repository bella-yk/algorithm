package programmers.stack_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 스택/큐 > 프린터
 */
public class Solution42587 {
    public static int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> priority = new PriorityQueue<>(Comparator.reverseOrder());

        for(int p : priorities) {
            priority.add(p);
        }

        while (!priority.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priority.peek() == priorities[i]) {
                    if (i == location) {
                        return answer;
                    }
                    answer++;
                    priority.poll();
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        System.out.println(solution(priorities, location));
    }
}
