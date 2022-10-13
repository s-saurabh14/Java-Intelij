import java.util.Arrays;
import java.util.Scanner;

public class Check_ChangeValue {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num1= in.nextInt();
//        int num2= in.nextInt();
//        swap(num1, num2);
//        System.out.println( num1 + "," + num2);
//    }
//    static void swap(int a, int b){
//        int temp = a;
//        a=b;
//        b=temp;
//       // System.out.println(a + "," + b);


        int arr[] = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int []nums){
        nums[1] = 7;
    }
}
