package programmers.etc;

import java.util.*;

/**
 * 곱이 n 이 만들어지는 소수의 조합 찾기
 */
public class C02 {
    public static long[] C02(long n) {
        long[] answer = {-1, -1};
        Set<Long> set = getPrime(n);
        List<Long> primeList = new ArrayList<>(set);

        if(set.contains(n)) {
            return answer;
        }

        for(int i=0; i<set.size(); i++) {
            if(primeList.contains(n/primeList.get(i)) && n % primeList.get(i) == 0) {
                answer = new long[]{primeList.get(i), n/primeList.get(i)};
            }
        }

        return answer;
    }

    public static Set<Long> getPrime(long n) {
        Set<Long> set = new HashSet<>();

        for(long i=2; i<=n; i++) {
            set.add(i);
        }

        for(long i=2; i*i<=n; i+=1) {
            for(long j=i*i; j<=n; j+=i) {
                set.remove(j);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        long n = 6;

        System.out.println(C02(n));
    }
}
