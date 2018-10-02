package zadania.OddOccurrencesInArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public static int solution(int[] A) {

//        Arrays.sort(A);
//        int counter = 1;
//        for (int i = 0; i < A.length; i++) {
//            if (A[i + 1] == A[i]) {
//                counter ++;
//            } else {
//                if (counter % 2 == 1) {
//                    return A[i];
//                } else {
//                    counter = 1;
//                }
//            }
//        }
//        return 0;
//        -----------------------------------------------------------
//        List<Integer> values = new ArrayList<>();
//        for (Integer item : A) {
//            if (!values.contains(item)) {
//                values.add(item);
//                int counter = 0;
//                for (int i = 0; i < A.length; i++) {
//                    if (item == A[i]) {
//                        counter ++;
//                    }
//                }
//                if (counter % 2 == 1) {
//                    return item;
//                }
//            }
//        }
//        return 0;

        HashMap map = new HashMap();
        for (Integer item : A) {
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                int number = (int) map.get(item);
                map.put(item, ++ number);
            }
        }
        for (Object key : map.keySet()) {
            if (((int) map.get(key)) % 2 == 1) {
                return (int) key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] tab1 = {2, 4, 3, 7, 2, 7, 4, 4, 4, 3, 7, 3, 7};
        int[] tab2 = {5, 6, 7, 5, 7};

        System.out.println(solution(tab1));
        System.out.println(solution(tab2));
    }
}
