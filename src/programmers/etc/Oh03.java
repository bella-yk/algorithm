package programmers.etc;

import java.util.*;

public class Oh03 {
    private static int count=0;
    private static Map<String, Integer> map = new HashMap<>();

    public static int[] solution(int a, int b) {
        int[] answer = {0, 0};

        if (a % 2 == 0 || b % 2 == 0)
            System.out.println("Player 1");
        else
            System.out.println("Player 2");

//        if((a == 0 || b == 0) && count == 0) {
//            return new int[]{0, 1};
//        } else {
//            int[] result = playGame("A", a, b);
//            a = result[0];
//            b = result[1];
//
//            if(a == 0 && b == 0) {
//                return new int[]{0, count};
//            }
//            result = playGame("B", a, b);
//            a = result[0];
//            b = result[1];
//
//            if(a == 0 && b == 0) {
//                return new int[]{1, count};
//            } else {
//                solution(a, b);
//            }
//        }
        return answer;
    }

    private static int[] playGame(String user, int a, int b) {
        int coins = Optional.ofNullable(map.get(user)).orElse(0);

        if(a == 0) {
            coins += b;
            b=0;
        } else if(b == 0) {
            coins += a;
            a=0;
        } else {
            int rCase = Arrays.asList(1, 2, 3).get(new Random().nextInt(3));
            switch (rCase) {
                case 1:
                    coins += b;
                    b=0;
                    break;
                case 2:
                    coins += a;
                    a=0;
                    break;
                case 3:
                    if(a > b) {
                        coins += (b * 2);
                        a -= b;
                        b=0;
                    } else {
                        coins += (a * 2);
                        b -= a;
                        a=0;
                    }
                    break;
            }
        }
        map.put(user, coins);
        count ++;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 3));
    }
}
