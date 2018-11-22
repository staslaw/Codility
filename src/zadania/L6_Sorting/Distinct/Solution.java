package zadania.L6_Sorting.Distinct;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (Integer item : A) {
            set.add(item);
        }
        return set.size();
    }


    public static void main(String[] args) {

        int[] A = {1, 3, 2, 3, 1};
        System.out.println(solution(A));
    }
}
