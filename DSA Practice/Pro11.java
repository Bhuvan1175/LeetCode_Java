// Largest Num among 3 Num
import java.util.Scanner;
public class Pro11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :");
        int firstNum=sc.nextInt();
        System.out.print("Enter the Second number :");
        int secondNum=sc.nextInt();
        System.out.print("Enter the Third number :");
        int thirdNum=sc.nextInt();
        // if(firstNum>secondNum && thirdNum<firstNum){
        //     System.out.println("The first number is greater than the second number and the third number is smaller than first Num : "+firstNum);
        // }else if(secondNum>firstNum && secondNum>thirdNum){
        //     System.out.println("The second number is greater than the first number and the third number : "+secondNum);
        // }else if(thirdNum>firstNum && thirdNum > secondNum){
        //     System.out.println("The third number is greater than the first number and the second number : "+thirdNum);
        // }
        int Largest=Math.max(Math.max(firstNum,secondNum), thirdNum);
        System.out.println("The Largest Number : "+Largest);

        sc.close();
    }
}