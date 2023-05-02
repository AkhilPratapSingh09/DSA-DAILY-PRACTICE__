import java.util.*;
public class StringBuilderbase {
    public static void main(String[]args){
        StringBuilder sb= new StringBuilder("hello");
        System.out.println(sb);

        char ch = sb.charAt(0);
        System.out.println(sb);

        sb.setCharAt(0, 'd');
        System.out.println(sb);

        sb.insert(2, '3');
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);
    }   
}
