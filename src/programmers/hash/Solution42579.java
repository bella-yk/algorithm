package programmers.hash;

import java.util.*;

/**
 * 해시 > 베스트 앨범
 */
public class Solution42579 {
    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        Map<String, Integer> playSum = new LinkedHashMap<>();

        for(int i=0; i<genres.length; i++) {
            int count = Optional.ofNullable(playSum.get(genres[i])).orElse(0);

            playSum.put(genres[i], count+plays[i]);
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(playSum.entrySet());
        entryList.sort(Map.Entry.comparingByValue());




        return answer;
    }


    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.printf(String.valueOf(solution(genres, plays)));
    }
}
