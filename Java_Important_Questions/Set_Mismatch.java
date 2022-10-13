import java.util.Arrays;

  //Q. https://leetcode.com/problems/set-mismatch

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] arr= {8,7,3,5,3,6,1,4};
         findDuplicateAnd_MissedNumbers(arr);
        System.out.println(Arrays.toString(findDuplicateAnd_MissedNumbers(arr)));

    }

    static int[] findDuplicateAnd_MissedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                }
             else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                  return new int[] {arr[j], j+1};
            }

        }
        return new int[] {-1, -1};

    }


    static void swap(int[] arr,int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }

}
