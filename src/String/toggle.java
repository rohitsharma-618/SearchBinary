package String;
import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        System.out.println(s);

        for (int i = 0;i < s.length()-1;i++){
            boolean flag = true; // true --> capital
            char ch = s.charAt(i);
            if(ch == ' ') continue;
            int asci = (int)ch;
            if (asci >= 97) flag = false; //small
            if (flag == true ){// capital
                asci += 32;
                char dh = (char)asci ; //a
                s.setCharAt(i,dh);
            }else {
                //small
                asci -=32;
                char dh = (char)asci;
                s.setCharAt(i,dh);
            }
        }
        System.out.println(s);
    }

}
