import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        try (Scanner fileInput = new Scanner(new File("duomenys.txt"))) {
            List<Integer> allValues = new ArrayList<>();
            int firstLineValue = 0;
            int firstLineCount = 0;
            boolean firstLine = true;

            // Read all integers and remember how many are on the first line.
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                Scanner lineInput = new Scanner(line);

                while (lineInput.hasNextInt()) {
                    int value = lineInput.nextInt();
                    allValues.add(value);

                    if (firstLine) {
                        firstLineValue = value;
                        firstLineCount++;
                    }
                }

                lineInput.close();
                firstLine = false;
            }

            // Accept both formats:
            // 1) n on the first line, followed by n numbers;
            // 2) the numbers only, as shown in the example.
            int startIndex = 0;
            if (firstLineCount == 1
                    && firstLineValue >= 0
                    && allValues.size() - 1 == firstLineValue) {
                startIndex = 1; // Skip the count n.
            }

            for (int i = startIndex; i < allValues.size(); i++) {
                numbers.add(allValues.get(i));
            }

            int smallerCount = 0;

            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i) < numbers.get(i - 1)) {
                    smallerCount++;
                }
            }

            System.out.println(smallerCount);

        } catch (FileNotFoundException e) {
            System.out.println("File duomenys.txt not found.");
        }
    }
}
