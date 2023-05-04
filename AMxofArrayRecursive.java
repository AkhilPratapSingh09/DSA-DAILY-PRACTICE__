import java.util.*;
public class AMxofArrayRecursive {
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }

        int max = displayMaxEle(arr, 0);
        System.out.println(max);

    }
    public static int displayMaxEle(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int misa = displayMaxEle(arr, idx + 1);
        if(misa > arr[idx]){
            return misa;
        }
        else{
            return arr[idx];
        }
    }
}
