package arrayBasics;
import java.util.Scanner;
public class swapAlternates {
    public static int []takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the array element at "+i+" th index");
            array[i]=s.nextInt();
        }
        return array;
    }

    public static void swapAlternative(int arr[]){
        for(int i=0;i<(arr.length-1);i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
public static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the test cases");
        int t= s.nextInt();
        for(int i=0;i<t;i++){
            int arr[]=takeInput();
            swapAlternative(arr);
            print(arr);
        }
    }
}
