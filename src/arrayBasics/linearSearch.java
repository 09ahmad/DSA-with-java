package arrayBasics;
import java.util.Scanner;
public class linearSearch {
    public static int []takeInput(){
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elemenet at "+i+" th index");
             arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int linearSearch(int arr[],int search){
        for(int i=0;i<arr.length;i++){
            if(search==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]=takeInput();
        int number=linearSearch(arr,5);
        System.out.println("The element is present at "+number+ "th index");
    }
}
