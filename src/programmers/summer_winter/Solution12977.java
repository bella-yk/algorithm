package programmers.summer_winter;

/**
 * Summer/Winter Coding(~2018) > 소수 만들기
 */
public class Solution12977 {
    public static int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    System.out.println(String.format("%d %d %d", nums[i], nums[j], nums[k]));
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrimeNumber(sum)) {
                        answer ++;
                    }
                }
            }
        }

        return answer;
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        // 2부터 i의 제곱이 넘어온 number변수보다 작을 경우 반복문을 수행
        for (int i = 2; i * i <= number; i++) {
            // 나머지가 0일 경우 소수가 아니므로 false
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(solution(nums));
    }
}
