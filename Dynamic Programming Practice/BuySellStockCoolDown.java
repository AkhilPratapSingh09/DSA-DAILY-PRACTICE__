import java.util.*;
public class BuySellStockCoolDown {
   public static void main(String[]args){
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    int []arr= new int[n];
    for(int i=0; i<arr.length;i++){
        arr[i]= scn.nextInt();

    }

    int obsp=-arr[0];//old bought stock price
    int ossp= 0; //old sell stock price
    int ocsp=0; //old colldown stock price

    for(int i=1; i<arr.length; i++){
        int nbsp=0;
        int nssp=0;
        int ncsp=0;

        if(ocsp -arr[i] > obsp){
            nbsp=ocsp-arr[i];
        }
        else{
            nbsp=obsp;
        }
        if(obsp +arr[i]>ossp){
            nssp=obsp+arr[i];
        }
        else{
            nssp=ossp;
        }
        if(ossp>ocsp){
            ncsp=ossp;
        }
        else{
            ncsp=ocsp;
        }

        obsp=nbsp;
        ossp=nssp;
        ocsp=ncsp;
    }
    System.out.println(ossp);
   } 
}
