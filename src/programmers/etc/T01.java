package programmers.etc;

public class T01 {
    public static int solution(int[][] office, int k) {
        int answer = -1;

        for(int i=0; i<=office.length-k; i++) {
            for(int j=0; j<=office.length-k; j++) {
                int sum = 0;
                for(int f=0; f<k; f++) {
                    for(int q=0; q<k; q++) {
                       sum += office[i+f][j+q];
                    }
                }
                if(sum > answer) {
                    answer = sum;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        int[][] office = {{1,0,0,0}, {0,0,0,1}, {0,0,1,0}, {0,1,1,0}};
        int[][] office = {{1,0,0}, {0,0,1}, {1,0,0}};
        System.out.println(solution(office, 2));
    }
}
