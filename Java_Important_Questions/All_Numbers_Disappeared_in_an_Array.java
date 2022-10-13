import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
       findDisappearedNumbers(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(findDisappearedNumbers(arr));

    }

    // note:- in cyclic sort sorting is done on pattern where element lies between 1 to N.
    // where current index of element is one less than value of element.
    static List findDisappearedNumbers(int[] arr){
        List<Integer> res= new ArrayList<>();
        int i=0;
        while (i < arr.length) {
            int correct= arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
             if (arr[j] != j+1){
                   res.add(j+1);
             }

        }
        return res;

    }
    static void swap(int[] arr,int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
