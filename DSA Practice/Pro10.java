// depreciation expense
import java.util.Scanner;
public class Pro10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost price of the asset:");
        double assetsCost=sc.nextDouble();
        System.out.println("Enter the useful life of the asset:");
        int years=sc.nextInt();
        System.out.println("Enter the salvage value of the asset:");
        double salvage=sc.nextDouble();
        double depreciation=(assetsCost-salvage)/years;
        System.out.println("The depreciation expense is: "+depreciation);
        sc.close();
    }
}
