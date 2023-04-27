package codility;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Y2 {
    public static int solution(int[] A) {
        int answer = 0;
        int range = A.length;
        Arrays.sort(A);

        PriorityQueue<Integer> before = new PriorityQueue();
        PriorityQueue<Integer> after = new PriorityQueue();
        for(int num : A) {
            before.offer(num);
        }

        while (!before.isEmpty()) {
            if (answer >= 1000000000) {
                return -1;
            }
            int target = before.poll();
            boolean isAllow = A[range-1] == range;

            if(!after.contains(target)) {
                after.offer(target);
            } else {
                if(isAllow) {
                    target--;
                } else {
                    target++;
                }
                before.offer(target);
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 1};
//        int[] A = {2, 1, 4, 4};
//        int[] A = {6, 2, 3, 5, 6, 3};
        System.out.println(solution(A));
    }
}
