// Fibonacci Series In Java Programs
import java.util.Scanner;
public class Pro01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print("Fibonacci Series "+a+","+b+",");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(+c+",");
            a=b;
            b=c;
        }
        sc.close();
    }
}
