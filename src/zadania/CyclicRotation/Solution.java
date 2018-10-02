package zadania.CyclicRotation;

import java.util.Arrays;
import java.util.Random;

public class Solution {

    public static int[] solution(int[] A, int K) {
        int lengthA = A.length;
        int[] newTab = new int[lengthA];
        for (int i = 0; i < lengthA; i++) {
            int x = (i + K) / (lengthA);
            newTab[i + K - x * (lengthA)] = A[i];
        }
        return newTab;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10) + 1;
        int[] startTab = new int[n];

        for (int i = 0; i < startTab.length; i++) {
            startTab[i] = random.nextInt(21) - 10;
        }

        System.out.println(Arrays.toString(startTab));
        int number = random.nextInt(10) + 1;
        System.out.println(number);
        System.out.println(Arrays.toString(solution(startTab, number)));
    }
}
