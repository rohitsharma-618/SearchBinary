package String;
import java.util.*;

public class toggleString {
    public static void main(String[] args) {
        String s = "roHIt ShaRmA";
        for (int i = 0;i < s.length();i++){
            boolean flag = true; // true --> capital
            char ch = s.charAt(i);
            if(ch == ' ') continue;
            int asci = (int)ch;
            if (asci >= 97) flag = false; //small
            if (flag == true ){// capital
                asci += 32;
                char dh = (char)asci ; //a
               s = s.substring(0,i)+ dh + s.substring(i+1);
            }else {
                //small
                asci -=32;
                char dh = (char)asci;
               s = s.substring(0,i)+ dh + s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}
