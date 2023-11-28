package arrayBasics;
import java.util.Scanner;
public class sumOfelement {

    public static int sum(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int [] input(){
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element at "+ i + " index");
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]=input();
        int sumofelement=sum(arr);
        System.out.println(sumofelement);
    }
}
