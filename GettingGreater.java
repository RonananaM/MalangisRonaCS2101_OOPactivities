import java.util.Scanner;

public class CompareCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two characters
        System.out.print("Enter the first character: ");
        char char1 = scanner.next().charAt(0);
        
        System.out.print("Enter the second character: ");
        char char2 = scanner.next().charAt(0);

        // Find the character with the greater value
        char greaterChar = (char) Math.max(char1, char2);

        // Print the results
        System.out.println("Character with greater value: " + greaterChar);
        System.out.println("ASCII code of " + char1 + ": " + (int) char1);
        System.out.println("ASCII code of " + char2 + ": " + (int) char2);

        // Close the scanner
        scanner.close();
    }
}
