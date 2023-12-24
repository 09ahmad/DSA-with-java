package arrayBasics;
import java.util.Scanner;
public class takingInput2dArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numeber of rows");
        int row=s.nextInt();
        System.out.println("enter the number of columns");
        int col=s.nextInt();

        int arr[][]=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("enter the element at "+i+" row "+j+" col");
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
