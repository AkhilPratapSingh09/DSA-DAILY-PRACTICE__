
import java.util.*;
public class stringparts {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);

        String s="abc,def,hig,ysidkjc";
        String[] parts= s.split(",");
        for(int i=0; i<parts.length; i++){
            System.out.println(parts[i]);
        }

    }
}