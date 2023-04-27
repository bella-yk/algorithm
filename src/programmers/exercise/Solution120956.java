package programmers.exercise;

public class Solution120956 {
  public static int solution(String[] babbling) {
      int answer = 0;
      String[] possible = {"aya", "ye", "woo", "ma"};

      for(int i=0; i < babbling.length; i++) {
        String s = babbling[i];
          for(String p : possible) {
              if (s.equals(p)) {
                answer ++;
                break;
              }
              if (s.indexOf(p) > -1) {
                  int index = s.indexOf(p);
                  s = s.substring(0, index) + s.substring(index + p.length());
                  babbling[i] = s;
              }
          }
      }
      return answer;
    }

    public static void main(String[] args) {
      String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
      System.out.println(solution(babbling));
    }

}
