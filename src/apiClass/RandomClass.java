package apiClass;

import java.util.Arrays;
import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        int[] selectNumber1 = new int[6];
        int[] selectNumber2 = new int[6];
        int[] selectNumber3 = new int[6];
        Random random1 = new Random(6);
        Random random2 = new Random(6);
        Random random3 = new Random(10);
        for (int i = 0; i < selectNumber1.length; i++) {
            selectNumber1[i] = random1.nextInt(45) + 1;
            selectNumber2[i] = random2.nextInt(45) + 1;
            selectNumber3[i] = random3.nextInt(45) + 1;
        }
        System.out.println(Arrays.toString(selectNumber1));
        System.out.println(Arrays.toString(selectNumber2));
        System.out.println(Arrays.toString(selectNumber3));
    }
}
