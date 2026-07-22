import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        // Create scanner object to read terminal input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        long number = scanner.nextLong();
        
        // Handle negative numbers by converting to absolute value
        long temp = Math.abs(number);
        
        int sumEven = 0;
        int sumOdd = 0;
        
        // Loop to extract and evaluate every individual digit
        while (temp > 0) {
            int digit = (int) (temp % 10); // Extract the last digit
            
            if (digit % 2 == 0) {
                sumEven += digit;          // Add to even tracker
            } else {
                sumOdd += digit;           // Add to odd tracker
            }
            
            temp /= 10;                     // Drop the evaluated digit
        }
        
        // Output results
        System.out.println("Sum of even digits: " + sumEven);
        System.out.println("Sum of odd digits: " + sumOdd);
        
        scanner.close();
    }
}
