package zadania.L4_Counting_Elements.FrogRiverOne;

import java.util.*;

public class Solution {

    public static int solution(int X, int[] A) {
        HashMap map = new HashMap();
        for (int i = 1; i <= X; i++){
            map.put(i, null);
        }
        for (int i = 0; i < A.length; i++) {
            map.remove(A[i]);
            if (map.size() == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int X = random.nextInt(100000) + 1;
        int N = random.nextInt(100000) + 1;
        int[] tab = new int[N];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(X) + 1;
        }
        System.out.println("szerokość rzeki to: " + X);
        System.out.println(Arrays.toString(tab));
        System.out.println(solution(X, tab));
    }
}
