package zadania.L3_Time_Complexity.FrogJmp;

import java.util.Random;

public class Solution {

    public static int solution(int X, int Y, int D) {
        int number = (Y - X) / D;
        if (X + D * number >= Y) {
            return number;
        } else {
            return number + 1;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int X = random.nextInt(10) + 1;
        int D = random.nextInt(10) + 1;
        int Y = 0;
        while (Y < X) {
            Y = random.nextInt(10) + 1;
        }
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("D = " + D);

        System.out.println("liczba skoków: " + solution(X, Y, D));
    }
}
