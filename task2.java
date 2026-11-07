import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter integers one by one (enter 0 to stop):");

        while (true) {
            int number = input.nextInt();

            // Zero is the stopping value and is not counted.
            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        input.close();
    }
}
