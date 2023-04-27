package programmers.etc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class T02 {
    public static List<Double> list = new ArrayList<>();
    public static HashSet<Double> set = new HashSet<>();
    public static boolean[] visited = new boolean[100];
    public static long solution(long n) {
        list.add(1d);
        visited[0] = false;

        for(int i=1; i<=4; i++) {
            list.add(Math.pow(3, i));
            visited[i] = false;

            for(int r = 2; r <= list.size(); r++) {
                System.out.println("\n" + list.size() + "개 중에 " + r  + "개 뽑음");
                comb1(list, visited, 0, r);
            }

            if(set.size() >= n) {
                break;
            }
        }
        long[] arr = list.stream().mapToLong(Double::longValue).toArray();
        return arr[(int)n-1];
    }

    //1. 백트래킹을 이용해 구현
    static void comb1(List<Double> tmp, boolean[] visited, int start, int r) {
        if(r == 0) {
            print(tmp, visited);
        } else {
            for(int i = start; i < tmp.size(); i++) {
                visited[i] = true;
                comb1(tmp, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }

    // 배열 출력
    static void print(List<Double> tmp, boolean[] visited) {
        double sum = 0d;
        for(int i = 0; i < tmp.size(); i++) {
            if(visited[i] == true) {
                sum += tmp.get(i);
                System.out.print(tmp.get(i) + " ");
            }
        }
        System.out.println();
        list.add(sum);
    }

    public static void main(String[] args) {
        long n = 11;
        System.out.println(solution(n));
    }
}
