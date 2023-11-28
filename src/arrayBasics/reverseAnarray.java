package arrayBasics;

public class reverseAnarray {
    public static int[]reverseArray (int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5};

            // Reverse the array
            int[] reversedArray = reverseArray(originalArray);

            // Display the original and reversed arrays
            System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));
            System.out.println("Reversed Array: " + java.util.Arrays.toString(reversedArray));
    }
}
