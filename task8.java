public class task8 {
    public static int getInterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        int a = 0; // Represents F(0)
        int b = 1; // Represents F(1)
        int c = 0; // Stores the current F(n)
        
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 9; 
        System.out.println("The " + n + "th Fibonacci number is: " + getInterativeFibonacci(n));
    }
}
