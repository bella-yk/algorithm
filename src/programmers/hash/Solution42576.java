package programmers.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 해시 > 완주하지 못한 선수
 */
public class Solution42576 {
    public static String solution(String[] participant, String[] completion) {

        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        for (String partc : participant) {
            map.put(partc, map.getOrDefault(partc, 0) + 1);
        }
        for (String comp : completion) {
            map.put(comp, map.getOrDefault(comp, 0) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.printf(String.valueOf(solution(participant, completion)));
    }
}
