import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        Scanner input_temp = new Scanner(System.in);
        
        // Prompt the user to enter a Celsius value
        System.out.print("Enter a Celsius value: ");
        double temp = input_temp.nextDouble();
        
        // Convert Celsius to Fahrenheit
        double final_temp = temp * (9.0 / 5.0) + 32;
        
        // Display the result
        System.out.println(temp + " Celsius is " + final_temp + " Fahrenheit");
        
        // Close the scanner
        input_temp.close();
    }
}
