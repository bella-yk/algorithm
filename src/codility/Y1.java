package codility;

public class Y1 {
    public static int solution(int N) {
        int len = Integer.toString(N).length() - 1;

        return (int)(len == 0 ? 0 :  Math.pow(10, len));
    }

    public static void main(String[] args) {
        int N = 1;
        System.out.println(solution(N));
    }
}
