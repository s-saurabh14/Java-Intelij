import java.util.Scanner;

public class Swich_Next_Char {

    static String next_char(String wrd){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < wrd.length(); i++) {
            if (wrd.charAt(i)==122){
                sb.append("a");
            }
            else if (wrd.charAt(i)==90){
                sb.append("A");
            }
            else {

                sb.append( (char)(wrd.charAt(i)+1));
            }

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string ");
        String wrd = in.next();
        String res=next_char(wrd);
        System.out.println("After Sifting to next char Given String is  ");
        System.out.println(res);

    }
}
