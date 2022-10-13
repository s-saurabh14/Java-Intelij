import java.util.ArrayList;
import java.util.List;

public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        findDuplicateNumbers(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicateNumbers(arr));

    }

    // note:- in cyclic sort sorting is done on pattern where element lies between 1 to N.
    // where current index of element is one less than value of element.
    static int findDuplicateNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }


    static void swap(int[] arr,int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
