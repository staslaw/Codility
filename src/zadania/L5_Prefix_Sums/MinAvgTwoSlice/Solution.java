package zadania.L5_Prefix_Sums.MinAvgTwoSlice;


public class Solution {

    public static int solution(int[] A) {
        int resultIndex = A.length - 2;
        double localSum = (double) (A[A.length -1] + A[A.length - 2]);
        double localCount = 2d;
        double globalAvg = localSum / localCount;

        for (int i = A.length - 3; i >= 0; i--) {
            localSum = localSum + (double) A[i];
            localCount = localCount + 1d;
            double Avg1 = localSum / localCount;
            double Avg2 = ((double) (A[i] + A[i + 1])) / 2d;
            if (Avg2 <= Avg1) {
                localSum = (double) (A[i] + A[i + 1]);
                localCount = 2d;

                if (Avg2 <= globalAvg) {
                    globalAvg = Avg2;
                    resultIndex = i;
                }
            }
        }
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




//    public static int solution(int[] A) {
//        int resultIndex = 0;
//        double localSum = (double) (A[0] + A[1]);
//        double localCount = 2d;
//        double globalAvg = localSum / localCount;
//
//        for (int i = 2; i < A.length; i++) {
//            localSum = localSum + (double) A[i];
//            localCount = localCount + 1d;
//            double Avg1 = localSum / localCount;
//            double Avg2 = ((double) (A[i] + A[i - 1])) / 2d;
//            if (Avg2 <= Avg1) {
//                localSum = (double) (A[i] + A[i - 1]);
//                localCount = 2d;
//
//                if (Avg2 < globalAvg) {
//                    globalAvg = Avg2;
//                    resultIndex = i - 1;
//                }
//            }
//        }
//        return resultIndex;
//    }

