package sample;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;




        System.out.println("Input your a ticket: ");
        int ticket = sc.nextInt();

        firstNumber = ticket / 1000;
        secondNumber = (ticket % 1000)/100;
        thirdNumber = (ticket % 1000 % 100) / 10;
        fourthNumber = ticket % 1000 % 100 % 10;


        int firstSum = firstNumber + secondNumber;
        int secondSum = thirdNumber + fourthNumber;

        if(firstSum == secondSum){
            System.out.println("Your ticket is lucky");
                }
                else{
                    System.out.println("Your ticket is not lucky");
                }

            }

 }

