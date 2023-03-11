package sample;

import java.util.Scanner;

public class SandClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = 1;

        System.out.println("Input the weight: ");
        int w = sc.nextInt();


        for (int i = 1; i <= w; i++) {
            System.out.print("*");
            if (b <=i && b<w) {
                System.out.println("");
                b++;
                i = 0;
            }
            System.out.print("*");

            if (w==i){
                System.out.println();
                w--;
                i=0;
            }
        }
    }
}

