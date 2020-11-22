import java.util.Scanner;
import java.io.File;

public class WordsCunt2 {
    public static void main(String [] arg) throws Exception {
        File file = new File("criminal.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }
    System.out.println("Number of words: " + words);
    }

}
