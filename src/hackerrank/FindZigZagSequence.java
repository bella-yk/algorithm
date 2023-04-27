package hackerrank;

import java.util.Arrays;

public class FindZigZagSequence {
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = n/2;
        int temp = a[mid];
        int end = n - 1;
        a[mid] = a[end];
        a[end] = temp;

        int st = mid + 1;
        int ed = end - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main (String[] args) throws java.lang.Exception {
        int[] a ={1, 2, 3, 4, 5, 6, 7};
        // 1, 2, 3, 7, 5, 6, 4
        // 1, 2, 3, 7, 6, 5, 4
        int n = 7;
        findZigZagSequence(a, n);
    }
}
