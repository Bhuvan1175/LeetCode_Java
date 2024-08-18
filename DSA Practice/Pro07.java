
//Calculate Distance Between Two Points
import java.util.Scanner;

public class Pro07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Co-ordinate of Y");
        System.out.print("Enter The Co-ordinate X1 :");
        double x1 = sc.nextDouble();
        System.out.print("Enter The Co-ordinate X2 :");
        double x2 = sc.nextDouble();
        System.out.println("--------------------------------");
        System.out.println("Co-ordinate of Y");
        System.out.print("Enter The Co-ordinate Y1 :");
        double y1 = sc.nextDouble();
        System.out.print("Enter The Co-ordinate Y2 :");
        double y2 = sc.nextDouble();
        System.out.println("--------------------------------");
        System.out.println("Co-ordinate of Z");
        System.out.print("Enter The Co-ordinate Z1 :");
        double z1 = sc.nextDouble();
        System.out.print("Enter The Co-ordinate Z2 :");
        double z2 = sc.nextDouble();
        System.out.println("--------------------------------");
        sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Co-ordinate of X : " + x1 + " , " + x2 );
        System.out.println("Co-ordinate of Z : " + z1 + " , " + z2 );
        System.out.println("Co-ordinate of Y : " + y1 + " , " + y2 );
        System.out.println("--------------------------------");
        System.out.println("Distance Between Two Points In Which Space (2D or 3D)");
        String space = sc.nextLine();
        double distance2D;
        double distance3D;
        if (space.equalsIgnoreCase("2D")) {
            distance2D = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println("Distance Between Two Point in 2D Space :" + distance2D);
        } else if (space.equalsIgnoreCase("3D")) {
            distance3D = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
            System.out.println("Distance Between Two Point in 3D Space :" + distance3D);
        }
        sc.close();
    }
}
