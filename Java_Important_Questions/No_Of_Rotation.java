import java.util.Scanner;

public class No_Of_Rotation {
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
        int pivot= findPivot(arr);
        System.out.println("total number of rotaion in rotated array is = "+ (pivot+1));
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
