import java.util.Scanner;

public class Position_In_Infinite_Sorted_Array {


    static int find_start_end(int arry[],int target){
        int start=0;
        int end=1;
//        if((target >= arry[start]) && (target <= arry[end])){
//        int pos= binary_Search(arry,target,start,end);
//            return pos;
//        }
//        else{
//            start= start*2;
//            end= end*2;
//        }
        while (target > arry[end]){
            int new_start= end+1;
            // new end = previous end +sizeOfbox*2
            end= end+(end-start+1)*2;
            start= new_start;
        }
        return binary_Search(arry,target,start,end);


    }

    static int binary_Search(int arr[],int target,int start,int end){

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                System.out.println(target + " found");
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        System.out.println(target + " Not found");
        return -1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = -1;
        System.out.println("array size ");
        int n = in.nextInt();
        int[] infinite_arr = new int[n];
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < n; i++) {
            infinite_arr[i] = in.nextInt();
        }
        System.out.println("Enter target ");
        int target = in.nextInt();
       int pos= find_start_end(infinite_arr,target);
        System.out.println("position of element is "+pos);
    }
}
