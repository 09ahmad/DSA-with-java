package sorting;
public class insertionSort {
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0&&(arr[j]>temp)){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=temp;
        }
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []array ={4,2,5,7,22,12,1,23,15};
        insertionSort(array);
        printArray(array);
    }
}
