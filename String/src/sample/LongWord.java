package sample;

import java.util.Scanner;

public class LongWord {

    public static void main(String args[]) {

        System.out.println("Input the text: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        String[] text = string.split("[ ]");
        String maxString = text[0];

        for (int i = 1; i < text.length; ++i) {
            if (maxString.length() < text[i].length())
                maxString = text[i];
        }


        System.out.println("The long word: " + maxString);


    }
}