import java.util.Scanner;
public class Pro14 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any number : ");
    int n=sc.nextInt();
    int rem;
    int rev=0;
    System.out.println("Original Num : "+n);
    while(n>0){
        rem=n%10;
        rev=rev*10+rem;
        n/=10;
    }
    System.out.println("Reverse Number : "+rev);
    sc.close();
   } 
}
