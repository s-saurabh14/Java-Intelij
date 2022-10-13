import java.util.Arrays;

public class MissingElement_in_Zero_To_N {
    public static void main(String[] args) {
        int[] arr= {1};
        int missedNum= sorting(arr);
        System.out.println(missedNum);

    }
    // note:- in cyclic sort sorting is done on pattern where element lies between 1 to N.
    // where current index of element is one less than value of element.
    static int sorting(int[] arr){
        int i=0;
        int missed= -1;
        while (i < arr.length) {
            if(arr[i]==0){
                missed= i;

            }
            int correct= arr[i]-1;
            if(arr[i] != 0 && arr[i] != arr[correct] ){
                swap(arr, i, correct);
            }
             else {
                i++;
            }
        }
        return missed+1;

    }
    static void swap(int[] arr,int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
