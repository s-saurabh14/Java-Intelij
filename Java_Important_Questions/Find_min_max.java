import java.util.Scanner;

public class Find_min_max {
    static int Find_min(int[]arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    static int Find_max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        //System.out.println("maximum element is : " + max);
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("array size ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" element");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("minimum element is : " + Find_min(arr) );
        System.out.println("maximum element is : " + Find_max(arr));
    }


}
