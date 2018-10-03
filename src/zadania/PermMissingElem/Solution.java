package zadania.PermMissingElem;

import java.util.*;

public class Solution {

    public static int solution(int[] A) {
        HashMap map = new HashMap();
        for (int item : A) {
            map.put(item, true);
        }
        for (int i = 1; i <= (A.length + 1); i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Random random = new Random();
        int N = random.nextInt(100000) + 1;
        int[] tab = new int[N];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= (N + 1); i++) {
            list.add(i);
        }
        for (int i = 0; i < tab.length; i++) {
            int index = random.nextInt(list.size());
            tab[i] = list.get(index);
            list.remove(index);
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(solution(tab));
    }
}