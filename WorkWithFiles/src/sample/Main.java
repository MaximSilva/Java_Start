package sample;

        import java.io.File;
        import java.io.IOException;

public class Main {

    public static void main(String[] args) {
       File file1 = new File("a.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File workFolder = new File(".");
        File[] files = workFolder.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }

    }

}