package programmers.etc;

import java.util.*;

/**
 * 베송결과 찾기
 * {물건번호1, 물건번호2, 배송여부(1: 배송완료, 2: 미배송}
 * 잔고가 물건 한개라도 있으면 배송을 보내지 못한다.
 *
 * 물건번호 순서대로 잔고가 있으면 "O", 없으면 "X", 알수 없을 경우 "?" 출력
 */
public class C01 {
    public static String C01(int n, int[][] delivery) {
        String answer = "";
        Map<Integer, String> map = new HashMap<>();

        Arrays.sort(delivery, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[2] - o1[2];
            }
        });

        for(int i=0; i<delivery.length; i++) {
            int first = delivery[i][0];
            int second = delivery[i][1];

            if (delivery[i][2] == 1) {
                map.put(delivery[i][0], "O");
                map.put(delivery[i][1], "O");
            } else {
                if (map.get(first) != null) {
                    map.put(second, map.get(first) == "O" ? "X" : "?");
                } else if (map.get(second) != null) {
                    map.put(first, map.get(second) == "O" ? "X" : "?");
                } else {
                    map.put(first, "?");
                    map.put(second, "?");
                }
            }
        }

        for(int i=1; i<=n; i++) {
            answer += Optional.ofNullable(map.get(i)).orElse("?");
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 7;
//        int[][] delivery = {{1,3,1}, {3,5,0},{5,4,0},{2,5,0}};
        int[][] delivery = {{5,6,0}, {1,3,1},{1,5,0},{7,6,0}, {3,7,1}, {2,5,0}};

        System.out.println(C01(n, delivery));
    }
}
