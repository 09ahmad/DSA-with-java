package arrayBasics;
import java.util.Scanner;
public class largestRowAndlargestColSum {
    public static void print2dArray(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int [][]takeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=s.nextInt();
        System.out.println("Enter the number of columns");
        int cols=s.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the elements at "+i+"th row and"+j+"th colums");
                arr[i][j]=s.nextInt();
            }
        }
        return arr;
    }
    public static int largestRowAndColSum(int [][]arr){
        int rows=arr.length;
        int cols=arr[0].length;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){
            int maxSum=0,index=-1;
            for(int j=0;j<cols;j++){
            }

        }
    }
    public static void main(String[] args) {

    }
}
