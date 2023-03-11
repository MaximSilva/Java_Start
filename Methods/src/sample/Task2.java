package sample;

public class Task2 {

    public static void main(String[] args) {

        int s = drawSnow(4, 5);
        System.out.println(s);

    }


    public static int drawSnow(int height, int width) {

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
}
