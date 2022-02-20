package programmers.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 힙(Heap) > 디스크 컨트롤러
 */
public class Solution42627 {
    public static int solution(int[][] jobs) {
        int answer = 0;
        int end = 0; // 수행되고난 직후의 시간
        int jobsIdx = 0; // jobs 배열의 인덱스
        int count = 0; // 수행된 요청 갯수

        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        // 처리시간 별 큐
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        while (count < jobs.length) {
            while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= end) {
                queue.add(jobs[jobsIdx++]);
            }

            if (queue.isEmpty()) {
                end = jobs[jobsIdx][0];
            } else {
                int[] temp = queue.poll();
                answer += temp[1] + end - temp[0];
                end += temp[1];
                count++;
            }
        }
        return (int) Math.floor(answer / jobs.length);
    }

    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2,6}};
        System.out.println(solution(jobs));
    }
}
