package sample;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        System.out.println("Input price1: ");
        int price1 = sc.nextInt();
        System.out.println("Input price2: ");
        int price2 = sc.nextInt();
        System.out.println("Input price3: ");
        int price3 = sc.nextInt();
        int maxPrice = price1;

        if(price2 > maxPrice){
            maxPrice = price2;
        }
        if(price3 > maxPrice){
            maxPrice = price3;
        }
        System.out.println("Max price = " + maxPrice);

    }
}