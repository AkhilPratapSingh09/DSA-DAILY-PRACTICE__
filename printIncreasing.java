import java.util.*;
public class printIncreasing {
    public static void main(String[]main){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        PrintIncreasing(n);
    }
    public static void  PrintIncreasing(int n){
        if(n==0){
            return;
        }
        PrintIncreasing(n-1);
        System.out.println(n);
    }
}
