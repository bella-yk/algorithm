package programmers.etc;

import java.util.ArrayList;
import java.util.List;

public class T03 {
    public static int solution(int N) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            if(i < 3) {
                list.add(i);
            } else {
                int sum = list.get(i - 2) + list.get(i - 3);
                list.add(sum);
            }
        }

        return list.get(N-1);
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
