import java.util.Scanner; 
public class Pro12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().trim().charAt(0);
        if(c>='a'&&c<='z'){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }
        sc.close();
    }
}
