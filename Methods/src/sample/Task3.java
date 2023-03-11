package sample;

public class Task3 {

    public static void main(String[] args) {
        int res = linearSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        System.out.println(res);
    }



    public static int linearSearch(int arr[], int elementToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;

        }
        return -1;

    }
}
