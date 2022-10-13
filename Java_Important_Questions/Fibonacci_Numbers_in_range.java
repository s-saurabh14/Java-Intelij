import java.util.Scanner;

public class Fibonacci_Numbers_in_range {

    static int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
        }


        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            //int n = in.nextInt();
            System.out.println("enter min ");
            int min = in.nextInt();
            System.out.println("enter max ");
            int max = in.nextInt();
            for (int i = 0; i <= max; i++) {
               int res= fib(i);
                if(res>=min && res<=max){
                    System.out.println(fib(i));
                }
            }
        }

    }







