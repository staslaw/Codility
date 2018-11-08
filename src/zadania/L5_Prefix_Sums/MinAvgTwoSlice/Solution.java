package zadania.L5_Prefix_Sums.MinAvgTwoSlice;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] A) {
        int resultIndex = A.length;

        double[][] sums = new double[A.length - 1][];

       

        return resultIndex;
    }

    public static void main(String[] args) {
        int[] tab = {6, 12, -7, 4, -1, 9};
        System.out.println(solution(tab));
    }
}



//    public static int solution(int[] A) {
//        double[] minAvg = new double[A.length - 1];
//        int resultIndex = A.length;
//        double minimmum = 10000;
//
//        for (int i = 0; i < A.length - 1; i++) {
//            double localMinAvg = 10000;
//            double sum = A[i];
//
//            for (int j = i + 1; j < A.length; j++) {
//                sum = sum + A[j];
//                double avg = sum / (j - i + 1);
//                if (avg < localMinAvg) {
//                    localMinAvg = avg;
//                }
//            }
//            minAvg[i] = localMinAvg;
//            if (localMinAvg < minimmum) {
//                minimmum = localMinAvg;
//                resultIndex = i;
//            }
//        }
//
//        System.out.println(Arrays.toString(minAvg));
//
//
//        return resultIndex;
//    }

