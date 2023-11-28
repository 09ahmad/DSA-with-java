package assignment_loopsandOperators;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number upto which you want the value");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
          int  x = 3 * i + 2;
            if (x % 4 != 0) {
                System.out.println(x + " ");
            }
        }
    }
}
