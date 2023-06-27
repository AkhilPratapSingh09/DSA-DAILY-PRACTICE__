import java.util.*;
public class SelectionSort {
    public static void selectionsort(int []arr){
        for(int i=0; i<arr.length-1;i++){
            int mi= i;
            for(int j=i+1; j<arr.length;j++){
                if(isSmaller(arr,j,mi)){
                    mi=j;
                }
            }
            swap(arr,i,mi);
        }
    }  
    public static void swap(int []arr, int i, int j){
        int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
    public static boolean isSmaller(int []arr,int i,int j){
        if(arr[i]<arr[j]){
            return true;
        }else{
            return false;
        }
    }
    public static void print(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int []arr= new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }
        selectionsort(arr);
        print(arr);
    }
}
