import java.util.Arrays;
import java.util.Scanner;

public class Palindrom_Array {

    static void check_palindrom(int arr[],int l){
        for (int i = 0; i <= l/2 && l != 0; i++) {
            if(arr[i]!=arr[l-i-1]){
                System.out.println(Arrays.toString(arr) + " is not a palindrom array");
                break;

            }

        }
        System.out.println(Arrays.toString(arr) + " is a palindrom array");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("length of array");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter " + n + " element in array");
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        check_palindrom(arr,n);
    }
}
