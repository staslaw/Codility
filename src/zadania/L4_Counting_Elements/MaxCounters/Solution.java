package zadania.L4_Counting_Elements.MaxCounters;

import java.util.Arrays;
import java.util.Random;

public class Solution {

    public static int[] solution(int N, int[] A) {
        int[] resultTab = new int[N];

        int maxValue = 0;
        int localMaxValue = 0;
        int lengthA =  A.length;
        for (int i = 0; i < lengthA; i++) {
            int el = A[i];
            if (el <= N) {
                int index = el - 1;
                int value = ++ resultTab[index];
                if (value > localMaxValue) {
                    localMaxValue = value;
                }
            } else {
                maxValue += localMaxValue;
                localMaxValue = 0;
                resultTab = new int[N];
                }
            }
        for (int i = 0; i < N; i++) {
            resultTab[i] += maxValue;
        }
        return resultTab;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int N = random.nextInt(10) + 1;
        int M = random.nextInt(10) + 1;
        int[] A = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = random.nextInt(N + 1) + 1;
        }
        System.out.println("liczba liczników: (max wartość w tablicy + 1) " + N);
        System.out.println("liczba operacji: (rozmiar tabicy) " + M);
        System.out.println("tablica A: " + Arrays.toString(A));

        System.out.println(Arrays.toString(solution(N, A)));
    }
}
