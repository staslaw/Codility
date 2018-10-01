package zadania.BinaryGap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {

    public static int solution(int N) {
        List<Integer> numberTab = new ArrayList<Integer>();
        int M = N;
        while (M != 0) {
            int toAdd = (M % 2 == 1)? 1 : 0;
            numberTab.add(toAdd);
            M = M / 2;
        }
        System.out.println(numberTab);

        int counterMax = 0;
        int counterZero = 0;
        boolean canIcount = false;
        while (N != 0) {
            if (N % 2 == 1) {
                canIcount = true;
                if (counterZero > counterMax) {
                    counterMax = counterZero;
                    counterZero = 0;
                }
            } else {
                if (canIcount) {
                    counterZero ++;
                }
            }
            N = N / 2;
        }

        return counterMax;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(2147483647) + 1;
        System.out.println(n);
        System.out.println(solution(n));
    }
}