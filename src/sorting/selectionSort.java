package sorting;

public class selectionSort {
    public static void selectionSort(int []array){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
                if(min!=i){
                    int temp=array[i];
                    array[i]=array[min];
                    array[min]=temp;
            }
        }
    }
        public static void printArray(int []arr) {
            System.out.println("the sorted array is");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    public static void main(String[] args) {
        int array[]={2,5,3,8,1,11,9,4,12};
        selectionSort(array);
        printArray(array);
    }
}
