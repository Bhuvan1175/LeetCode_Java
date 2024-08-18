// Calculate Commission Percentage
// Formula :- Commission Percentage=(Total Sales/Commission Earned)×100
import java.util.Scanner;
public class Pro08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total sales");
        double totalSales = sc.nextDouble();
        System.out.println("Enter the commission earned");
        double commissionEarned = sc.nextDouble();
        double commissionPercentage = (commissionEarned/totalSales) * 100;
        System.out.println("Commission Percentage is " + commissionPercentage + "%");
        sc.close();
    }
}
