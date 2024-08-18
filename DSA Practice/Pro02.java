import java.util.Scanner;
public class Pro02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number :");
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     fact*=i;
        // }
        // System.out.println(fact);
        for(int i=1;i<=n;i++){
            int fact=1;
            for(int j=1;j<=i;j++){
                fact*=j;
            }
            System.out.println("Fact of "+i+ " is "+fact);
        }
        sc.close();
    }
}
