import java.util.Scanner;

public class Binary_Search {

    static int search_asc(int[] arr, int target) {
//        int mid=arr.length/2;
        int start = 0;
        int end = arr.length - 1;
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

    static int search_des(int[] arr, int target) {
//        int mid=arr.length/2;
        int start = 0;
        int end = arr.length - 1;
        while (start >= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                System.out.println(target + " found");
                return mid;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
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
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter target ");
        int target = in.nextInt();
        if (arr[0] < arr[n - 1]) {
            index = search_asc(arr, target);
        }
        else if (arr[0] > arr[n - 1]) {
                index = search_des(arr, target);
            }
        System.out.println("index of " + target + " is " + index);

    }
    }

