// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;
public class Pro03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n;
        while(true){
            System.out.println("Enter a number: ");
            n=sc.nextInt();
            if(n==0){
                break;
            }
            sum+=n;
        }
        System.out.println(sum);
        sc.close();
    }
}
