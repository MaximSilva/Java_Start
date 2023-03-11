package sample;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[] { -2, 5, 1, 8 };
        int s = calculateSumArrayElements(myArray);
        System.out.println(s);

    }



    public static int calculateSumArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

}