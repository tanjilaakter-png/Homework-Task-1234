import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the laptop price, current savings, and weekly savings.
        int p = input.nextInt();
        int s = input.nextInt();
        int m = input.nextInt();

        int k;

        if (s >= p) {
            k = 0;
        } else if (m <= 0) {
            System.out.println("It is not possible to save enough money.");
            input.close();
            return;
        } else {
            // Ceiling division gives the minimum whole number of weeks.
            k = (p - s + m - 1) / m;
        }

        System.out.println("k = " + k);
        input.close();
    }
}
