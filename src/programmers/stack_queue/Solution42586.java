package programmers.stack_queue;

import java.util.*;

/**
 * 스택/큐 > 기능개발
 */
public class Solution42586 {
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> day = new ArrayList<>();
        Set<Integer> releaseCnt = new LinkedHashSet<>();

        for(int i=0; i<progresses.length; i++) {
            day.add((100 - progresses[i])/speeds[i]);
        }

        int releaseCount = 0;
        for(int i=0; i<day.size()-1; i++) {
            if(day.get(i) < day.get(i+1)) {
                releaseCnt.add(releaseCount + 1);
                releaseCount = 0;
            } else {
                releaseCount ++;
            }
        }

        releaseCnt.add(releaseCount + 1);

        return releaseCnt.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(solution(progresses, speeds));
    }
}
