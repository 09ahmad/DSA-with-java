package arrayBasics;
import java.util.Scanner;
public class takingInput02 {

  public static void toPrint(int arr[]){
      int n=arr.length;
      for(int i=0;i<n;i++){
          System.out.print(arr[i]);
      }
  }
    public static  int[] takingInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of n");
        int n =s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at"+i+"th  index");
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {

      int arr[] =takingInput();
      toPrint(arr);
    }
}
