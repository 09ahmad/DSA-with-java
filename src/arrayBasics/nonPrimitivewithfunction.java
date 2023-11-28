package arrayBasics;
import java.util.Scanner;
public class nonPrimitivewithfunction {
    public static void increment(int i){
        i++;
    }
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++ ){
            System.out.print(arr[i]);
        }
    }
    public static void incrementArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        incrementArray(arr);
        printArray(arr);
    }
}
