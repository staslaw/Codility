package zadania.L5_Prefix_Sums.GenomicRangeQuery;

import java.util.Arrays;
import java.lang.*;

public class Solution {

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            String actual = S.substring(P[i], Q[i] + 1);
            int answer = 4;

            for (int j = 0; j < actual.length(); j++) {
                char actualChar = actual.charAt(j);
                if ('A'==actualChar) {
                    if (answer > 1) {
                        answer = 1;
                    }
                } else if ('C'==actualChar) {
                    if (answer > 2) {
                        answer = 2;
                    }
                } else if ('G'==actualChar) {
                    if (answer > 3) {
                        answer = 3;
                    }
                }
            }
            result[i] = answer;
        }
        return result;
    }


    public static void main(String[] args) {
        String S = "ACCGATCTGA";
        int[] P = {0, 2, 6, 7, 4};
        int[] Q = {0, 6, 9, 8, 5};
        System.out.println(Arrays.toString(solution(S, P, Q)));
    }
}
