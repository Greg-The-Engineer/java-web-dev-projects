import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountCharBonus {
    public static void main(String[] args) {
        try {
            File file = new File("./studio/input.txt"); // Replace with your file path
            Scanner fileScanner = new Scanner(file);

            StringBuilder stringBuilder = new StringBuilder();
            while (fileScanner.hasNextLine()) {
                stringBuilder.append(fileScanner.nextLine());
            }
            fileScanner.close();

            String input = stringBuilder.toString();
            input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Rest of the code remains the same
            // ...
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
