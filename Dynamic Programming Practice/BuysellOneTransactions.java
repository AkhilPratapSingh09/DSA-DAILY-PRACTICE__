import java.util.*;
public class BuysellOneTransactions {
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();

        int []prices= new int[n];
        for(int i=0; i<prices.length;i++){
            prices[i]=scn.nextInt();

        }

        int lst= Integer.MAX_VALUE;//least so far
        int op=0;//overall profit
        int pist=0; //profit if sold today

        for(int i=0; i<prices.length;i++){
            if(prices[i]<lst){
                lst=prices[i];
            }
            pist= prices[i] - lst;
            if(pist>op){
                op=pist;
            }

        }
        System.out.println(op);


    }
}
