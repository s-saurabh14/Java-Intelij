import java.util.Scanner;

public class Peak_Of_Mountain {

    static int findPeak(int[]arr){
        int start= 0;
        int end= arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start= mid+1;
            }
            else{
                end= mid;
            }
        }
        return start;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // int index = -1;
        System.out.println("array size ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
//        System.out.println("Enter target ");
//        int target = in.nextInt();

        System.out.println("Peak of mountain array is = "+findPeak(arr));
    }
}
