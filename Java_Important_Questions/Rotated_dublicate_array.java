import java.util.Scanner;

public class Rotated_dublicate_array {
    public static void main(String[] args) {
        //int[] arr= {4,5,6,7,0,1,2};
        Scanner in = new Scanner(System.in);
        int index = -1;
        System.out.println("array size ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter target ");
        int target = in.nextInt();
        System.out.println("pivot of array is = "+findPivot(arr));
        System.out.println("index of target element of array is = "+search(arr, target));


    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // pivot =-1 i.e array is not rotated so imply normal binary search
        if (pivot == -1) {
            return binary_search(nums, target, 0, nums.length - 1);
        }
        // if pivot found apply binary for two asc binary array
        if (nums[pivot] == target) {
            return pivot;
        }
        if (nums[0] <= target) {
            return binary_search(nums, target, 0, pivot - 1);
        } else {
            return binary_search(nums, target, pivot + 1, nums.length-1);
        }
    }



    static int findPivot(int[]arr){
        int start=0;
        int end= arr.length-1;
        while(start < end){
            int mid= start+(end-start)/2;
            // case 1
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            // case 2
            if(mid > start && arr[mid]< arr[mid-1]){
                return mid-1;
            }
            //case 3
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //first check if start is pivot or not
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                // similary check for end
                if(arr[end]< arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //case 4
            else if (arr[start]< arr[mid] || arr[mid]==arr[start] && arr[mid]>arr[end]) {
                        start= mid+1;
            }
            else{
                end= mid-1;
            }

        }
        return -1;
    }
    static int binary_search(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
