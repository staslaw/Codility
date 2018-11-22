package zadania.L5_Prefix_Sums.CountDiv;

public class Solution {

    public static int solution(int A, int B, int K) {
        int startPoint;
        if (A != 0) startPoint = A - 1;
        else startPoint = A;
        int result = B / K - startPoint / K;
        if (A == 0) result++;

        return result;
    }


    public static void main(String[] args) {

        System.out.println(solution(0,10,2));
    }
}
