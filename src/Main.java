import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./Shakespeare.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
           System.out.println(scan.nextLine());
        }
    }
}