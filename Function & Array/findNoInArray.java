
import java.io.*;
import java.util.*;

public class findNoInArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int [] arr= new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i]= scn.nextInt();
    }
    int d= scn.nextInt();
    int index=-1;
    
    for( index=0; index<arr.length; index++){
        if(arr[index]==d){
            System.out.println(index);
        }
    }
    
 }

}