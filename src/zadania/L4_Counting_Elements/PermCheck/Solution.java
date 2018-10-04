package zadania.L4_Counting_Elements.PermCheck;


import java.util.HashMap;

public class Solution {

    public static int solution(int[] A) {
        HashMap map = new HashMap();
        for (Integer item : A) {
            map.put(item, null);
        }
        for (int i = 1; i <= A.length; i++) {
            if (!map.containsKey(i)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] tab1 = {1, 4, 6, 2, 3};
        int[] tab2 = {1, 4, 6, 2, 3, 5, 8};
        int[] tab3 = {7, 1, 4, 6, 2, 3, 5, 8};

        System.out.println(solution(tab1));
        System.out.println(solution(tab2));
        System.out.println(solution(tab3));

    }
}
