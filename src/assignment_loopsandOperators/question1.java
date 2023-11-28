package assignment_loopsandOperators;
import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number upto which you have to do calculation");
        int n = s.nextInt();
        System.out.println("enter the choice");
        int choice= s.nextInt();
        if(choice==1){
            int sum=0;
            for(int i=1;i<=n;i++){
                sum=sum+i;
            }
            System.out.println("the sum of the number is   : "+sum);
        }
        else if(choice==2){
            int product=1;
            for(int i=1;i<=n;i++){
                product=product*i;
            }
            System.out.println("the product of number :" + product);
        }
        else {
            System.out.println("Enter the choioce  either 1 or 2 ");
        }

    }
}
