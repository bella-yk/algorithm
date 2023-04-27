package programmers.etc;

import java.util.*;

public class Oh01 {
    public static int solution(int n, int m, int[] points, String[] hands) {
        int answer = 0;
        char[][] handArr = new char[m][n];
        List<Map<Character, Integer>> pointList = new ArrayList<>();
        List<Character> winnerChar = new ArrayList<>();
        List<Integer> point = new ArrayList<>();

        // 배열에 가위바위보 결과 넣기
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                handArr[j][i] = hands[j].charAt(i);
            }
        }

        // 라운드 별 그룹 구하기
        for(int i=0; i<handArr.length; i++) {
            char[] round = handArr[i];
            Map<Character, Integer> pointMap = new HashMap<>();
            for(int j=0; j<round.length; j++) {
                int count = pointMap.get(round[j]) != null  ? pointMap.get(round[j]) : 0;
                pointMap.put(round[j], count + 1);
            }
            pointList.add(pointMap);
        }

        // 승자 구하기
        for(int i=0; i<pointList.size(); i++) {
            Map<Character, Integer> roundMap = pointList.get(i);
            if(roundMap.size() == 1 || (roundMap.size() == 3 && new HashSet<>(roundMap.values()).size() == 1)) {
                winnerChar.add('-');

                if(i != pointList.size()-1) {
                    points[i+1] += points[i];
                }
            } else if(roundMap.size() == 2) {
                Character[] keys = roundMap.keySet().toArray(new Character[0]);
                char win = getWinner(keys[0], keys[1]);
                // 음수
                if(points[i] < 0) {
                    // 진 그룹이 point 가져가기
                    winnerChar.add(win == keys[0] ? keys[1] : keys[0]);
                } else {
                    // 이긴그룹이 가져가기
                    winnerChar.add(win);
                }
            } else {
                // 같은 그룹을 제외한 그룹이 point 가져가기
                List<Map.Entry<Character, Integer>> list = new ArrayList<>(roundMap.entrySet());
                list.sort(Map.Entry.comparingByValue());
                if(roundMap.values().size() == 2) {
                    winnerChar.add(list.get(0).getKey());
                } else {
                    // 양수 ? 큰그룹 제외, 음수  작은그룹 제외
                    if(points[i] < 0) {
                        list.remove(0);
                        // 진 그룹이 point 가져가기
                        char a = list.get(0).getKey();
                        char b = list.get(1).getKey();
                        char win = getWinner(a, b);
                        winnerChar.add(win == a ? b : a);
                    } else {
                        // 이긴그룹이 가져가기
                        list.remove(2);
                        char a = list.get(0).getKey();
                        char b = list.get(1).getKey();
                        winnerChar.add(getWinner(a, b));
                    }
                }
            }
        }

        for(int i=0; i<n; i++) {
            int p=0;
            for(int j=0; j<m; j++) {
                if(handArr[j][i] == winnerChar.get(j)) {
                    p += points[j];
                }
            }
            answer = answer < p ? p : answer;
        }

        return answer;
    }

    // 두 그룹 중 양/음 비교하여 포인트 가져갈 그룹을 구함
    private static char getWinner(char a, char b) {
        switch (a) {
            case 'P':
                if(b == 'S') {
                    return b;
                } else {
                    return a;
                }
            case 'S':
                if(b == 'P') {
                    return a;
                } else {
                    return b;
                }
            case 'R':
                if(b == 'S') {
                    return a;
                } else {
                    return b;
                }
        }
        return a;
    }

    public static void main(String[] args) {
        int n=6;
        int m=5;
        int[] points = {5, -2, 1, 3, -5};
        String[] hands = {"PSPRSS", "SSRRSS", "RRRRRR", "RRSSPP", "SSSRRP"};

        System.out.println(solution(n, m, points, hands));
    }
}
