package sample;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = 1;

        System.out.println("Input the height: ");
        int h = sc.nextInt();


        for (int i = 1; i <= h; i++) {
            System.out.print("*");
            if (b <=i && b<h) {
                System.out.println();
                b++;
                i = 0;
            }
            if (h==i){
                System.out.println();
                h--;
                i=0;
            }
        }
    }
}
