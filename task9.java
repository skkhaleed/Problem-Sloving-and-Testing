public class task9 {
    public static boolean isPalindrome(int num) {
        // Negative numbers are not palindromes (e.g., -121 reversed is 121-)
        if (num < 0) {
            return false;
        }

        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            num = num / 10;
        }

        // If the reversed number equals the original, it is a palindrome
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        int testNumber = 121;
        
        if (isPalindrome(testNumber)) {
            System.out.println(testNumber + " is a palindrome.");
        } else {
            System.out.println(testNumber + " is not a palindrome.");
        }
    }
}
