package sample;

public class Task1 {

    public static void main(String[] args) {

        int[] myArray = new int[] { 3, 5, 1, 2 };
        int s = findMax(myArray);
        System.out.println(s);

    }



    public static int findMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];

            }
            else{
                continue;
            }

        }
        return max;
    }

}
