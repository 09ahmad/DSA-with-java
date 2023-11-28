package BasicPrograms;

import java.util.Scanner;
public class p_and_c_formula02 {
    public static int factorial(int n){
        int ans  = 1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static boolean isPrime(int n){

        for(int d=2;d<n;d++){
            if(n%d==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int r= s.nextInt();


//        int num = factorial(n);
//        int den1=factorial(r);
//        int den2=factorial(n-r);
//        int ans=num/(den1*den2);
//        System.out.println(ans);
        boolean ans=isPrime(13);
        System.out.println(ans);
    }
}
