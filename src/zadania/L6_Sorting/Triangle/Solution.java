package zadania.L6_Sorting.Triangle;


import java.util.Arrays;

public class Solution {


    public static int solution(int[] A) {

        Arrays.sort(A);

        System.out.println(Arrays.toString(A));

        for (int i = 0; i < A.length - 2; i++) {
            long a1 = (long) A[i] + (long) A[i + 1];
            long a2 = (long) A[i + 2];
            if (a1 > a2) {
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {

        int[] B = {4, 20, 10, 8, 41};
        int[] A = {4, 2147483647, 20, 10, 2147483647, 2, 41, 2147483647};
        System.out.println(solution(A));
    }
}
