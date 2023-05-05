import java.util.*;
public class AllIndexofArray {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
        int x =scn.nextInt();
        int []iarr = allIndices(arr,x,0,0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }
        for(int i =0; i<arr.length; i++){
            System.out.println(iarr[i]);
        }
    }
    public static int[] allIndices(int[] arr, int x,int idx, int fsf){
        if(idx == arr.length){
            return new int[fsf];
        }
        if(arr[idx])
    }
}
