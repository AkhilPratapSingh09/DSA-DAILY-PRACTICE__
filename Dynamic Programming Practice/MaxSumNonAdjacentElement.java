import java.util.*;
public class MaxSumNonAdjacentElement{
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        int[]arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }

        int include=arr[0];
        int exclude=0;

        for(int i=1;i<arr.length;i++){
            int newinclude=exclude+arr[i];
            int newexclude=Math.max(include,exclude);

            include=newinclude;
            exclude=newexclude;

        }
        int ans=Math.max(include,exclude);
        System.out.println(ans);
    }
}