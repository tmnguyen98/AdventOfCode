import java.io.File;
import java.util.Scanner;

/**
 * day1_part2
 */
public class day1_part2 {

    public static int TotalOneModule(int n) {
        if ((n <= 0)) {
            return 0;
        } else {
            return n + TotalOneModule((n/3)-2);
        }
    }
    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");                                               //Find and read test.txt
        Scanner scfile = new Scanner(file);

        int total = 0;
        int temp = 0;

        while (scfile.hasNextLine()) {
            temp = Integer.parseInt(scfile.nextLine());
            total += TotalOneModule(temp) - temp;
        }

        System.out.println(total);
        scfile.close();
    }
}