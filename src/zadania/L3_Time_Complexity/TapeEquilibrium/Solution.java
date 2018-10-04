package zadania.L3_Time_Complexity.TapeEquilibrium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution {

    public static int solution(int[] A) {
        List<Integer> sums = new ArrayList<>();
        int sum = 0;
        for (Integer item : A) {
            sum += item;
            sums.add(sum);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < (sums.size() - 1); i++) {
            int sumA = sums.get(i);
            int sumB = sum - sums.get(i);
            int subtract = Math.abs(sumA - sumB);
            if (subtract < min) {
                min = subtract;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int N = random.nextInt(99999) + 2;
        int[] tab = new int[N];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(2001) - 1000;
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(solution(tab));

        String s = "o";
        String a = s = "abn";
        System.out.println(a.codePointAt(1));
    }
}