package arrayBasics;
import java.util.Scanner;
public class printAllPairs {
    public static void printallPair(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                System.out.println("("+arr[i]+ ","+ arr[j]+")");
            }
        }
    }
    public static int[] takeInput(){
        Scanner s  = new Scanner(System.in);
        int n= s.nextInt();
        int array[]=new int [n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at "+i+" th index");
            array[i]=s.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int arr[]=takeInput();
        printallPair(arr);
    }
}
