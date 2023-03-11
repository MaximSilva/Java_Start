package sample;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;
        int sixthNumber = 0;




        System.out.println("Input your a palindrome: ");
        int palindrome = sc.nextInt();

        firstNumber = palindrome / 100000;
        secondNumber = (palindrome % 100000)/10000;
        thirdNumber = (palindrome % 100000 % 10000) / 1000;
        fourthNumber = (palindrome % 100000 % 10000 % 1000) / 100;
        fifthNumber = (palindrome % 100000 % 10000 % 1000 % 100) / 10;
        sixthNumber = palindrome % 100000 % 10000 % 1000 % 100 % 10;

        if(firstNumber == sixthNumber && secondNumber == fifthNumber && thirdNumber == fourthNumber) {

            System.out.println("This is palindrome! ");

        }
        else{
            System.out.println("This isn't palindrome! ");
        }


    }

}
