package sample;

public class Multiply {

    public static void main(String[] args) {

        int number = 5;
        int res = 0;

        for (int i = 1; i <= 10; i++) {
            res = i * number;
            System.out.println(i + "*" + number + "=" + res);
        }

    }
}
