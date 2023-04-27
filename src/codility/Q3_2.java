package codility;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q3_2 {
    public static int solution(int[] A, int K) {

        int result = 0;

        for(int i = 0; i < (A.length-K + 1); i++){
            int[] temp = {}; //제외하는 수 앞부분의 배열
            int[] resArr = {}; //수 제외한 후의 배열
            int total = 0; // 차이값
            int min = 0;
            int max = 0;

            if(i != 0){
                temp = Arrays.copyOfRange(A, 0, i);
            }

            //앞부분 배열과 제외하는 수 뒷배열 합치기
            resArr = IntStream.concat(IntStream.of(temp), IntStream.of(Arrays.copyOfRange(A, K+i, A.length))).toArray();

            //최종 배열 정렬 후에 차이값 구해서 비교하기
            Arrays.sort(resArr);
            min = resArr[0];
            max = resArr[resArr.length-1];
            total = max-min;

            if(total<result || i == 0){
                result = total;
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] A = {5, 3, 6, 1, 3};
        int[] A = {8, 8, 4, 3};
//        int[] A = {3, 5, 1, 3, 9, 8};
        int K = 2;
        System.out.println(solution(A, K));

    }
}
