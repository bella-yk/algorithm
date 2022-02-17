package programmers.etc;

/**
 * {1, 2, 4, 5, 6, 8, 10}
 * 1부터 10까지의 숫자중 없는 값의 합을 구하라
 *
 * 현장 > 손코딩
 */
public class N01 {
    public static int N01(int[] arr) {
        int answer = 0;

        int target = 0;
        for(int i=0; i<=10; i++) {
            if(i != arr[target]) {
                answer += i;
            }else {
                target++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 8, 10};

        System.out.println(N01(arr));
    }

}
