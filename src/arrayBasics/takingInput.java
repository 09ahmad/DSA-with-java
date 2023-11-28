package arrayBasics;
import java.util.Scanner;
public class takingInput {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = s.nextInt();
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at" + i+"th index");
            arr[i]=s.nextInt();
        }
        System.out.println("the array elements are");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
