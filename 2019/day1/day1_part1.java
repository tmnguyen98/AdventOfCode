import java.io.File;
import java.util.Scanner;

/**
 * day1_part1
 */
public class day1_part1 {

    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");                                               //Find and read test.txt
        Scanner scfile = new Scanner(file);
        
        int total = 0;
        int temp = 0;

        while (scfile.hasNextLine()) {
            temp = Integer.parseInt(scfile.nextLine());
            total += (temp / 3) - 2;
        }

        System.out.println(total);
        scfile.close();
    }
}