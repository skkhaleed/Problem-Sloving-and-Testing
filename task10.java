public class task10 {
    public static int sumOfLastDigits(int num1, int num2) {
        // Use Math.abs to correctly handle negative numbers (e.g., -15 % 10 is -5)
        int lastDigit1 = Math.abs(num1 % 10);
        int lastDigit2 = Math.abs(num2 % 10);
        
        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        int a = 124; // Last digit is 4
        int b = -98; // Last digit is 8
        
        int result = sumOfLastDigits(a, b);
        System.out.println("The sum of the last digits is: " + result); // Output: 12
    }
}
