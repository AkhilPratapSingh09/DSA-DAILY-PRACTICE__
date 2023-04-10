
import java.util.*;
public class BasetoDeci {
    public static void main(String[]args){
    Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int b= scn.nextInt();
        int dn= getValueInBase(n,b);
        System.out.println(dn);
    }
    public static int getValueInBase(int n, int b){
        int rv=0;//return value

        int p=1;
        while(n>0){
            int dig = n%10;
            n=n/10;

            rv += dig * p;
            p= p*b;

        }
        return rv;
    }
}
        