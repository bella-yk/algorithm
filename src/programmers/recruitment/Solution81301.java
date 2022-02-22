package programmers.recruitment;

import java.util.HashMap;
import java.util.Map;

/**
 * 2021 카카오 채용연계형 인턴십 > 숫자 문자열과 영단어
 */
public class Solution81301 {
    public static int solution(String s) {
        Map<Integer, String> numMap = new HashMap<>();
        numMap.put(0, "zero");
        numMap.put(1, "one");
        numMap.put(2, "two");
        numMap.put(3, "three");
        numMap.put(4, "four");
        numMap.put(5, "five");
        numMap.put(6, "six");
        numMap.put(7, "seven");
        numMap.put(8, "eight");
        numMap.put(9, "nine");

        for (int i=0; i<numMap.size(); i++) {
            if(s.contains(numMap.get(i))) {
                s = s.replaceAll(numMap.get(i), Integer.toString(i));
            }
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }
}
