import java.io.*;
import java.util.*;

public class fibonacci{

public static void main(String[] args) throws Exception {
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    
    int fib= fibMemoized(n, new int[n+1]);
    System.out.println(fib);
    

 }
 public static int fibMemoized(int n, int[] qb){
     if(n==0 || n==1){
         return n;
     }
     if(qb[n] !=0){
         return qb[n];
     }
     int fibnm1= fibMemoized(n-1, qb);
     int fibnm2= fibMemoized(n-2, qb);
     int fibn = fibnm1 + fibnm2;
     
     qb[n]= fibn;
     return fibn;
 }

}