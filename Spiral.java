// import java.util.*;
// public class Spiral {
//     public static void main(String[]args){
//         Scanner scn= new Scanner(System.in);

//         int n=scn.nextInt();
//         int m= scn.nextInt();

//         int [][]arr= new int[n][m];
//         for(int i=0; i<arr.length; i++){
//             for(int j=0;j<arr[0].length;j++){
//                 arr[i][j]=scn.nextInt();

//             }
//         }
//         int minr=0;
//         int minc=0;
//         int maxr= arr.length-1;
//         int maxc=arr[0].length-1;

//         int tne=n*m;
//         int count=0;

//         while(count<tne){
//             //left wall
//             for(int i=minr, j=minc; i<=maxr && count < tne; i++){
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             minc++;

//             //bottom wall
//             for(int i=maxr,j =maxc; i<=maxc && count<tne; j++){
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             maxr--;

//             //right wall

//             for(int i=maxr, j=maxc; i>=minr && count <tne; i--){
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             maxc--;

//             //top wall
//             for(int i= minr, j=maxc; j>= minc &count < tne; j--){
//                 System.out.println(arr[i][j]);
//                 count++;
//             }
//             minr++;
//         }
//     }

// }


import java.io.*;
import java.util.*;

public class Spiral {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());
      int[][] arr = new int[n][m];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            arr[i][j] = Integer.parseInt(br.readLine());
         }
      }

      int cnt = 0;
      int tne  = n * m;
      int minr = 0;
      int minc = 0;
      int maxr = n - 1;
      int maxc = m - 1;
      while(cnt < tne){
         for(int i = minr; i <= maxr && cnt < tne; i++){
            System.out.println(arr[i][minc]);
            cnt++;
         }
         minc++;

         for(int j = minc; j <= maxc && cnt < tne; j++){
            System.out.println(arr[maxr][j]);
            cnt++;
         }
         maxr--;

         for(int i = maxr; i >= minr && cnt < tne; i--){
            System.out.println(arr[i][maxc]);
            cnt++;
         }
         maxc--;

         for(int j = maxc; j >= minc && cnt < tne; j--){
            System.out.println(arr[minr][j]);
            cnt++;
         }
         minr++;

      }
   }

}
   // tfegyu