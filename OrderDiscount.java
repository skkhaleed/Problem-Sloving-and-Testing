import java.util.Scanner;

public class OrderDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order number (1, 2, 3...): ");
        int order = sc.nextInt();

        System.out.print("Enter order amount: ");
        double amount = sc.nextDouble();

        double discount = 0;

        if (order == 1) {
            discount = amount * 0.10; // 10%
        } else if (order == 2) {
            discount = amount * 0.20; // 20%
        } else {
            discount = 0; // No discount
        }

        double finalAmount = amount - discount;

        System.out.println("Order Number : " + order);
        System.out.println("Original Amount : " + amount);
        System.out.println("Discount : " + discount);
        System.out.println("Final Amount : " + finalAmount);

        sc.close();
    }
}