import java.util.*;
public class countDistinctElement {
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        int  n= scn.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n;i++){
            num[i]=scn.nextInt();
        }

        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<num.length;i++){
            set.add(num[i]);
        }
        System.out.println(set.size());
    }
}
