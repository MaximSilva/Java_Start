package sample;

import java.util.Arrays;


public class MirrorArray {

    public static void main(String[] args) {

        int[] arr1 = {7, 2, 9, 4};
        System.out.println(Arrays.toString(arr1));
        reverseArr1(arr1);
        System.out.print(Arrays.toString(arr1));

    }

    public static int[] reverseArr1(int[] arr1) {

        if (arr1 == null) return arr1;
        int n = arr1.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[n - 1 - i];
            arr1[n - 1 - i] = temp;

        }
        return arr1;
    }
}
