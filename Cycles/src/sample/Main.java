package sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial;
        int result = 1;

        System.out.println("Input factorial from 4 to 16: ");
        factorial = sc.nextInt();

        if(factorial >= 4 && factorial <= 16){


            for (int i = 1; i <= factorial; i++) {
                result = result * i;
            }
            System.out.println(result);

        }
        else{
            System.out.println("Error!");
        }
    }
}