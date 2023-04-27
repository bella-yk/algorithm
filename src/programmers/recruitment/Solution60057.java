package programmers.recruitment;

/**
 * 2020 KAKAO BLIND RECRUITMENT > 문자열 압축
 */
public class Solution60057 {
    public static int solution(String s) {
        int answer = 0;

        for(int i=1; i<=s.length()/2; i++) {
            System.out.println("index:::"+ i);
            for(int j=0; j<=s.length()/i; j+=i) {
                String target = s.substring(0, j);
                System.out.println(target);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s1 = "aabbaccc";
        String s2 = "ababcdcdababcdcd";
        String s3 = "abcabcdede";
        String s4 = "abcabcabcabcdededededede";
        String s5 = "xababcdcdababcdcd";

        System.out.println(s1 + " ====> " + solution(s1));
//        System.out.println(s2 + " ====> " + solution(s2));
//        System.out.println(s3 + " ====> " + solution(s3));
//        System.out.println(s4 + " ====> " + solution(s4));
//        System.out.println(s5 + " ====> " + solution(s5));
    }
}
