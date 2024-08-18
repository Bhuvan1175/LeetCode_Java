
// Calculate Discount Of Product
import java.util.Scanner;

public class Pro06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of product:");
        double productPrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the discount percentage (e.g., 10%):");
        String dis = sc.nextLine();
        double discout;
        double total;
        switch (dis) {
            case "5%":
                discout = productPrice * 0.05;
                total = productPrice - discout;
                System.out.println("Discount on " + productPrice + " Rs. of " + dis + " : " + total);
                break;

            case "10%":
                discout = productPrice * 0.1;
                total = productPrice - discout;
                System.out.println("Discount on " + productPrice + " Rs. of " + dis + " : " + total);
                break;

            case "15%":
                discout = productPrice * 0.15;
                total = productPrice - discout;
                System.out.println("Discount on " + productPrice + " Rs. of " + dis + " : " + total);
                break;

            case "20%":
                discout = productPrice * 0.2;
                total = productPrice - discout;
                System.out.println("Discount on " + productPrice + " Rs. of " + dis + " : " + total);
                break;

            case "25%":
                discout = productPrice * 0.25;
                total = productPrice - discout;
                System.out.println("Discount on " + productPrice + " Rs. of " + dis + " : " + total);
                break;

            case "30%":
                discout = productPrice * 0.3;
                total = productPrice - discout;
                System.out.println("Discount on " + productPrice + " Rs. of " + dis + " : " + total);
                break;
            case "35%":
                discout = productPrice * 0.35;
                total = productPrice - discout;
                System.out.println("Discount on " + productPrice + " Rs. of " + dis + " : " + total);
                break;
            case "40%":
                discout = productPrice * 0.4;
                total = productPrice - discout;
                System.out.println("Discount on " + productPrice + " Rs. of " + dis + " : " + total);
                break;
            case "45%":
                discout = productPrice * 0.45;
                total = productPrice - discout;
                System.out.println("Discount on " + productPrice + " Rs. of " + dis + " : " + total);
                break;
            case "50%":
                discout = productPrice * 0.5;
                total = productPrice - discout;
                System.out.println("Discount on " + productPrice + " Rs. of " + dis + " : " + total);
                break;

            default:
                break;
        }
        sc.close();
    }
}
