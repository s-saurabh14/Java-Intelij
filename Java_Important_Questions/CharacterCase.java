import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println(ch + " is a UpperCase");
        }
        else if(ch>=97 && ch<=122){
            System.out.println(ch + " is a LowerCase");
        }
        else{
            System.out.println(ch + " not a Alphabet");
        }


    }
}
