package programmers.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * 연습문제 > 소수 찾기
 */
public class Solution12921 {
    public static int solution(int n) {
        int answer = 0;
        List<Boolean> primeList = getPrimeList(n);

        return (int)primeList.stream().filter(i -> i == true).count();
    }

    public static List<Boolean> getPrimeList(int n) {

        // n+1만큼 할당
        List<Boolean> primeList = new ArrayList<>(n+1);
        // 0번째와 1번째를 소수 아님으로 처리
        primeList.add(false);
        primeList.add(false);
        // 2~ n 까지 소수로 설정
        for(int i=2; i<=n; i++ )
            primeList.add(i, true);

        // 2 부터  ~ i*i <= n
        // 각각의 배수들을 지워간다.
        for(int i=2; (i*i)<=n; i++){
            if(primeList.get(i)){
                for(int j = i*i; j<=n; j+=i) primeList.set(j, false);
                //i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
            }
        }

        return primeList;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
