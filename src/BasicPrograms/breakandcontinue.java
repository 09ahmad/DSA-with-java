package BasicPrograms;

import java.util.Scanner;
public class breakandcontinue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
     int n =10;
        int i=1;
        while(i<=n){
           if(i==5){
               i++;
               continue;
           }
            System.out.println(i);
           i=i+1;
        }
    }
}
