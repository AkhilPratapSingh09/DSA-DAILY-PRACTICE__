import java.util.*;
public class StackPrac {
    public static void main(String[]args){
        Stack<Integer> st =new Stack<>();

        st.push(10);
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.push(20);
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.push(40);
        System.out.println(st + "->" + st.peek() + " " + st.size());

        st.push(60);
        System.out.println(st + "->" + st.peek() + " " + st.size());

        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
    }
}


// gueohfufh fdbvkxlmmdf nbkm.lwdmdmv bkml;kvlcxvmdsm,af bklwnm fdbvkxlmmdf nbkm.lwdmdmv bkml;dvml, fzsd.,kklfndklbfjddnfjkdbj