package searching;

public class qsn01 {
   public static void rotateArray(int[] arr, int n) {
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

       int array[]={1,2,3,4,5};
        rotateArray(array,5);

    }
}
