package sample;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[] { 4, -7, 5, 0 };

        String result = Arrays.toString(arr);
        System.out.println(result);

        int[] newArray = Arrays.copyOfRange(arr, 0, 3);
        System.out.println(Arrays.toString(newArray));

        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));

    }
}
