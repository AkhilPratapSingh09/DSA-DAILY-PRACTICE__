import java.util.*;
public class factorial {
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        int n= scn.nextInt();
        int fact= factoriall(n);
        System.out.println(fact);
    }    
    public static int  factoriall(int n){
        if( n==1){
            return 1;
        }
        int fac= factoriall(n-1);
        int f= n*fac;
        return f;
    }
}
