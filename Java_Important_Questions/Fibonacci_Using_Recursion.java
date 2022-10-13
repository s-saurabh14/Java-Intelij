import java.util.Scanner;

public class Fibonacci_Using_Recursion {
    static int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }


    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <=n; i++) {
                System.out.println(fib(i));
            }
        }
    }


