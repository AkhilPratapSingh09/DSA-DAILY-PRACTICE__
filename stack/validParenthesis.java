import java.util.*;
public class validParenthesis {
    public static boolean isValid(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }
        }
    }
}
