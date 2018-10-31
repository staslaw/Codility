package zadania.L5_Prefix_Sums.PassingCars;

public class Solution {

public static int solution(int[] A) {
    int counter = 0;
    int indexOfLastZero = A.length - 1;
    int lastNumberOfOne = 0;
    for (int i = A.length - 1; i >= 0; i--) {
        if (A[i] == 0) {
            for (int j = i; j <= indexOfLastZero; j++) {
                if (A[j] == 1) {
                    lastNumberOfOne ++;
                }

            }
            indexOfLastZero = i;
            counter = counter + lastNumberOfOne;

            if (counter > 1000000000) {
                return -1;
            }
        }
    }
    return counter;
}


    public static void main(String[] args) {
        int[] A = {0, 0, 1, 0, 1, 1};
        System.out.println(solution(A));
    }

}
