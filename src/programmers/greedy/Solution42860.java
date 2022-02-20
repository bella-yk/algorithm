package programmers.greedy;

/**
 * 탐욕법(Greedy) > 조이스틱
 */
public class Solution42860 {
    public static int solution(String name) {
        int answer = 0;

        // A : 65, Z : 90
        int index = 0;
        char mid = 'M';
        char c = 'A';
        for(Character character : name.toCharArray()) {
            if(character > mid) {
                answer += 90 - character;
            } else if (character < mid) {
                answer += character - 65;
            } else {
                answer += mid;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String name = "JEROEN";
        System.out.println(solution(name));
    }
}
