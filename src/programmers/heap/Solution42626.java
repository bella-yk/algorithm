package programmers.heap;

import java.util.PriorityQueue;

/**
 * 힙(Heap) > 더맵게
 */
public class Solution42626 {
    public static int solution(int[] scoville, int K) {
        int count = 0;
        int newScov = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(Integer arr : scoville){
            queue.offer(arr);
        }

        while(true){
            if(queue.size() ==1 && queue.peek() >= K ) return count;
            if(queue.size() ==1 ) return -1;

            int first = queue.poll();
            int second = queue.poll();


            if(first >= K) break;

            newScov = first + (second*2);
            count++;

            queue.offer(newScov);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(solution(scoville, k));
    }
}
