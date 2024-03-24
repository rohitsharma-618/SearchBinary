package String;
import java.util.*;

public class reverseWordInSentance {
    public static void main(String[] args) {
        String s = "MY NAME IS ROHIT SHARMA ";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i =0; i <s.length();i++){
            char ch = s.charAt(i);
            if (ch != ' '){
                sb.append(ch);
            }else {
                sb.reverse();
                ans += sb;
                ans += " ";
//                sb.delete(0,sb.length());
                sb = new StringBuilder("");


            }

        }
        System.out.println(ans);
    }
}
