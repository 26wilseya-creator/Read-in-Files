import java.io.*;
import java.util.*;

public class files{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("numbers.txt");
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


        Scanner scanner2 = new Scanner (file);
        //String[] names = new String[counter];
        int count = 0;
        int [] numList = new int [count];
        count = 0;
        while (scanner2.hasNextLine()) {
            line = scanner2.nextLine().trim();
            int num = 0;
            if (!line.isEmpty()) {
                
                num = Integer.parseInt(line);
                numList[count] = num;
                count++;
            }
        }

        for (int i = 0; i < numList.length; i++) {
            System.out.println(numList[i]);
        }
        System.out.println(numList[1] + numList[3]);
        scanner2.close();
    }
}