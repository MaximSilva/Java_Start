package sample;

import java.util.Scanner;

public class InputArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }


        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
    }
}
