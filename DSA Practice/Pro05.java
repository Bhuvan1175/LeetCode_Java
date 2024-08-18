// Calculate Average Of N Numbers.
import java.util.Scanner;
public class Pro05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int sum=0;
        int count=0;
        while(true){
            System.out.println("Enter the number of elements: ");
            n=sc.nextInt();
            if (n == 0) {
                break;
            }
            sum=sum+n;
            count++;
        }
        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            float avg = (float) sum / count;
            System.out.println("Average of " + count + " numbers is " + avg);
        }

        sc.close();
    }
    
}
