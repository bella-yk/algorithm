package programmers.hash;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 해시 > 전화번호 목록
 */
public class Solution42577 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length-1; i++) {

            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[j].startsWith(phone_book[i])) {
                    return false;
                } else {
                    break;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] phone_book = {"12", "123", "1235", "567", "88"};

        System.out.printf(String.valueOf(solution(phone_book)));
    }
}
