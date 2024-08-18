// Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class Pro04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        int num;
        while(true){
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            if(num==0){
                break;
            }
            if(num>max){
                max=num;
            }
        }
        if(max==0){
            System.out.println("Invalid input. Please enter a positive integer.");
        }else{
            System.out.println("Largest Value : "+max);
        }
        sc.close();
    }
}
