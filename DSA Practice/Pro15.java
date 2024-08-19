// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
import java.util.Scanner;

public class Pro15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter any number :");
        int count=0;
        for (int  i=1;i<=30;i++) {
            if(i%2==0){
                System.out.println("Kunal can go out on day "+i);
                count++;
            }
        }
        System.out.println("Kunal Goes out in August Month is : "+count+" times.");
        sc.close();
    }
}
