// Power In Java
import java.util.Scanner;
public class Pro09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base :");
        int base = sc.nextInt();
        System.out.print("Enter the exponent :");
        int exponent = sc.nextInt();
        double result =Math.pow(base,exponent);
        System.out.println("Power of "+base+ " to the power of "+exponent+ " : "+result);
        sc.close();
    }
}
