package zadania.L4_Counting_Elements.MissingInteger;

import java.util.*;

public class Solution {

    public static int solution(int[] A) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] > 0) {
//                set.add(A[i]);
//            }
//        }
//
//        for (int i = 1; i <= A.length + 1; i++) {
//            if (!set.contains(i)) {
//                return i;
//            }
//        }
//        return 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= A.length + 1; i++) {
            map.put(i, null);
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= A.length) {
                map.remove(A[i]);
            }
        }
        for (int i = 1; i <= A.length + 1; i++) {
            if (map.containsKey(i)) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int N = random.nextInt(10) + 1;
        int[] tab = new int[N];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(21) - 10;
        }
//        System.out.println(Arrays.toString(tab));
//        System.out.println(solution(tab));

//        int[] np = new int[6];
//        np[0] = 1;
//        np[1] = 3;
//        np[2] = 6;
//        np[3] = 4;
//        np[4] = 1;
//        np[5] = 2;
//        System.out.println(solution(np));

        int[] np2 = new int[3];
        np2[0] = 1;
        np2[1] = 2;
        np2[2] = 3;
        System.out.println(solution(np2));
    }
}
