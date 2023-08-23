import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharBonus {
    public static void main(String[] args) {
        try {
            File file = new File("./input.txt"); // Replace with your file path
            Scanner fileScanner = new Scanner(file);

            StringBuilder stringBuilder = new StringBuilder();
            while (fileScanner.hasNextLine()) {
                stringBuilder.append(fileScanner.nextLine());
            }
            fileScanner.close();

            String input = stringBuilder.toString();
            input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

            char[] characters = input.toCharArray();
            Map<Character, Integer> charCount = new HashMap<>();

            for (char c : characters) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
