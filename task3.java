import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int negativeDays = 0;

        // Read the number of days and temperatures from duomenys.txt.
        try (Scanner input = new Scanner(new File("duomenys.txt"))) {
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                int temperature = input.nextInt();

                if (temperature < 0) {
                    negativeDays++;
                }
            }

            if (negativeDays == 0) {
                System.out.println("No negative temperatures recorded");
            } else {
                System.out.println(negativeDays);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File duomenys.txt not found.");
        }
    }
}
