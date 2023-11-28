package assignment_loopsandOperators;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int temp=n;
        int rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        System.out.println("The reverse of the number is :" +rev);
    }
}
