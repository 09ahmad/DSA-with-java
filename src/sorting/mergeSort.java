package sorting;
public class mergeSort {
    public static void merge2Array(int arr1[],int arr2[],int []arr3){
        int i=0,j=0,k=0;
            while((i<arr1.length)&&(j<arr2.length)) {
                if (arr1[i] < arr2[j]) {
                    arr3[k] = arr1[i];
                    i++;
                    k++;
                } else {
                    arr3[k] = arr2[j];
                    j++;
                    k++;
                }
            }
                while(i<arr1.length){
                    arr3[k]=arr1[i];
                    i++;
                    k++;
                }
                while(i<arr2.length){
                    arr3[k]=arr3[j];
                    j++;
                    k++;
                }
            }
    public static void printArray(int arr3[]){
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6,8,10};
        int arr3[]=new int[(arr1.length)+(arr2.length)];
        merge2Array(arr1,arr2,arr3);
        printArray(arr3);
    }
}
