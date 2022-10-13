import java.util.Scanner;

public class Min_In_RotatedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = -1;
        System.out.println("array size ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Min element is = "+findMin(arr));
    }
    static int findMin(int[] nums) {
        int min= searchMin(nums);
        if(min== -1){
            return nums[0];
        }
        return searchMin(nums);
    }
    static int searchMin(int[]arr){
        int start=0;
        int end= arr.length-1;
        while(start < end){
            int mid= start+(end-start)/2;
            // case 1
            if(mid < end && arr[mid] > arr[mid+1]){
                return arr[mid+1];
            }
            // case 2
            if(mid > start && arr[mid]< arr[mid-1]){
                return arr[mid];
            }
            //case 3
            if(arr[start] <= arr[mid]){
                start= mid+1;

            }
            // case 4
            else{
                end= mid-1;
            }
        }
        return -1;
    }

}
