public class Pro13 {
    public static void main(String[] args) {
        int n=456632;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==6){
                count++;
            }
            n/=10;
        }
        System.out.println("6 occurs in number is "+count+" times.");
    }
}
