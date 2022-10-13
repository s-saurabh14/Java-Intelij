import java.util.Scanner;

public class Sum_of_maxFour {
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
        System.out.println("sum of largest four element of given array "+sum_largetFour(arr));
    }
    static int sum_largetFour(int[]arr){
        int curr= Integer.MIN_VALUE;
        int prev= Integer.MIN_VALUE;
        int first= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        if(arr[0]>=arr[1]){
            curr=arr[0];
            prev=arr[1];
        }
        else{
            curr=arr[1];
            prev=arr[0];
        }
        for (int i = 2; i < arr.length ; i++) {
            if(arr[i]>=curr){
                second=first;
                first= prev;
                prev= curr;
                curr= arr[i];
            }
            else if (arr[i]<= curr && arr[i]>= prev) {
                second=first;
                first= prev;
                prev= arr[i];
            }
            else if (arr[i]<= prev && arr[i]>= first) {
                second=first;
                first= arr[i];
            }
            else if (arr[i]<= first && arr[i]>= second) {
                second= arr[i];
            }

        }
        int sum= curr + prev + first + second;
            return sum;

    }
}
