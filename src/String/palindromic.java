package String;
import java.util.*;

public class palindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder g = new StringBuilder(s);
        g.reverse();

        String str = g + "";

        if (s.equals(str)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
