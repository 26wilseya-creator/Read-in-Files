import java.io.*;
import java.util.*;

public class files{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("animals.txt");
        Scanner scanner = new Scanner (file);
        String line = "";
        
        int counter = 0;
        while (scanner.hasNextLine()) {
             line = scanner.nextLine().trim();

             if (!line.isEmpty()) {
                counter++;
             }
        }
        System.out.println(counter);
        scanner.close();
    }
}