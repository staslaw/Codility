package zadania.L5_Prefix_Sums.GenomicRangeQuery;

import java.util.Arrays;
import java.lang.*;

public class Solution {

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int[] lastA = new int[S.length()];
        int[] lastC = new int[S.length()];
        int[] lastG = new int[S.length()];

        char firstChar = S.charAt(0);
        lastA[0] = -1;
        lastC[0] = -1;
        lastG[0] = -1;

        if ('A' == firstChar) {
            lastA[0] = 0;
        } else if ('C' == firstChar) {
            lastC[0] = 0;
        } else if ('G' == firstChar) {
            lastG[0] = 0;
        }

        for (int i = 1; i < S.length(); i++) {
            char actualChar = S.charAt(i);
            lastA[i] = lastA[i - 1];
            lastC[i] = lastC[i - 1];
            lastG[i] = lastG[i - 1];

            if ('A' == actualChar) {
                lastA[i] = i;
            } else if ('C' == actualChar) {
                lastC[i] = i;
            } else if ('G' == actualChar) {
                lastG[i] = i;
            }
        }

        for (int j = 0; j < result.length; j++) {

            if (lastA[Q[j]] >= P[j]) {
                result[j] = 1;
            } else if (lastC[Q[j]] >= P[j]) {
                result[j] = 2;
            } else if (lastG[Q[j]] >= P[j]) {
                result[j] = 3;
            } else {
                result[j] = 4;
            }
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


//    public static int[] solution(String S, int[] P, int[] Q) {
//        int[] result = new int[P.length];
//
//        for (int i = 0; i < P.length; i++) {
//            int answer = 4;
//
//            for (int j = P[i]; j <= Q[i]; j++) {
//                char actualChar = S.charAt(j);
//                if ('A' == actualChar) {
//                    answer = 1;
//                    break;
//                } else if ('C' == actualChar && answer > 2) {
//                    answer = 2;
//                } else if ('G' == actualChar && answer > 3) {
//                    answer = 3;
//                }
//            }
//            result[i] = answer;
//        }
//        return result;
//    }


// ---

//    public static int[] solution(String S, int[] P, int[] Q) {
//        int[] result = new int[P.length];
//
//        for (int i = 0; i < S.length(); i++) {
//            char actualChar = S.charAt(i);
//            int answer = 4;
//
//            if ('A' == actualChar) {
//                answer = 1;
//            } else if ('C' == actualChar) {
//                answer = 2;
//            } else if ('G' == actualChar) {
//                answer = 3;
//            }
//
//            for (int j = 0; j < result.length; j++) {
//
//                if (i >= P[j] && i <= Q[j] && (result[j] > answer || result[j] == 0)) {
//                    result[j] = answer;
//                }
//
//            }
//
//        }
//        return result;
//    }