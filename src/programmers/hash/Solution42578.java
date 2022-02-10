package programmers.hash;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 해시 > 전화번호 목록
 */
public class Solution42578 {
    public static int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<clothes.length; i++) {
            Integer count = Optional.ofNullable(map.get(clothes[i][1])).orElse(0);
            map.put(clothes[i][1], count + 1);
        }

        for(int count : map.values()) {
            answer = answer * (count + 1);
        }

        // 하나도 입지 않는 경우 -1
        return answer - 1;
    }


    public static void main(String[] args) {
        String[][] phone_book = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.printf(String.valueOf(solution(phone_book)));
    }
}
