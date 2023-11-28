package searching;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class binarySearch {

    public static int binarySearch(int []arr,int n,int search){
        int s=0;
        int end=n-1;
        while(s<=end) {
          int  mid = (s + end) / 2;
            if (arr[mid] == search) {
                return mid;
            } else if (search<arr[mid]) {
                end = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[100];
        for(int i=0;i<n;i++){
            System.out.println("enter the element at "+ i +" th index");
            arr[i]=sc.nextInt();
        }
        int search=sc.nextInt();
        System.out.println(binarySearch(arr,n,search));
    }
}
