package programmers.recruitment;

import java.util.*;

/**
 * 2022 KAKAO BLIND RECRUITMENT
 * 신고 결과 받기
 */
public class Solution92334 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> reportCountMap = new HashMap<>();
        Map<String, List<String>> reportNameMap = new HashMap<>();

        report = Arrays.stream(report).distinct().toArray(String[]::new);

        for(String s : report) {
            String reporter = s.split(" ")[0];
            String target = s.split(" ")[1];

            List<String> targets = reportNameMap.get(reporter) == null ? new ArrayList<>() : reportNameMap.get(reporter);
            targets.add(target);

            reportNameMap.put(reporter, targets);
            reportCountMap.put(target, Optional.ofNullable(reportCountMap.get(target)).orElse(0) + 1);
        }

        for(int i=0; i<id_list.length; i++) {
            int receiveMail = 0;

            if(reportNameMap.get(id_list[i]) != null) {
                for(String target : reportNameMap.get(id_list[i])) {
                    if (target != null && reportCountMap.get(target) >= k) {
                        receiveMail++;
                    }
                }
            }
            answer[i] = receiveMail;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        System.out.printf(String.valueOf(solution(id_list, report, k)));
    }
}
