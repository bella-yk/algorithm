package codility;

import java.util.Arrays;

public class FindNonExistNum {
    public static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        int index = 0;
        for(int i=0; i<=9; i++) {
            if(index > numbers.length || numbers[index] != i) {
                answer += i;
            } else {
                index ++;
            }
        }
        return answer == 0 ? -1 : answer;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,6,7,8,0};
        System.out.println(solution(num));

    }
}
