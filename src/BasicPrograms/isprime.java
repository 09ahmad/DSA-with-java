package BasicPrograms;

import java.util.Scanner;
public class isprime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = 2;
        boolean divided = false;
        while (d < n) {
            if (n % d == 0) {
                divided = true;
                break;
            }
            d = d + 1;
        }
        if (divided) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}

