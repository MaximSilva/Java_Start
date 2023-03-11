package sample;

import java.util.Arrays;
import java.util.Random;

public class RandomArrays {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[array.length * 2];

        for (int i = 0; i < array2.length; i++) {
            if (i > 14) {
                array2[i] = array[i - 15] * 2;
            } else {
                array2[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(array2));

    }

}
