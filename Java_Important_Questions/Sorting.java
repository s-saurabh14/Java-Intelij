import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int []arr= {3,1,4,5,2,7};
        //bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Type 1
    static void bubbleSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped= false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp= arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]= temp;
                    swapped= true;
                }

            }
            if(!swapped){
                break;
            }
        }
    }

    // Type 2
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           int last = arr.length - i - 1;
           int maxIndex = getMaxIndex(arr, 0, last);
           swap(arr, maxIndex, last);
        }
    }
    // calculate max element in remaning array and return its index
    static int getMaxIndex(int[] arr, int start, int end){
        int max= start;
        for (int i = start; i <= end; i++) {
            if (arr[i]> arr[max]){
                max= i;
            }
        }
        return max;
    }

    // swap the elements to correct index
    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }

    //  Type 3
    static void insertionSort (int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j , j-1);
                }
                else {
                    break;
                }
            }

        }
    }


}
