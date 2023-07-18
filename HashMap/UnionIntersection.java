import java.util.*;
public class UnionIntersection {
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        int arr1[]= new int[n];
        for(int i=0; i<arr1.length; i++){
            arr1[i]=scn.nextInt(); 
        }
        int m= scn.nextInt();
        int arr2[]= new int[m];
        for(int i=0; i<arr2.length;i++){
            arr2[i]=scn.nextInt();
        }

        HashSet <Integer> set= new HashSet<>();

        //Union
        for(int i=0; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Union =" + set.size());

        //intersection
        set.clear();
        for(int i=0; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count =0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("intersection= "+count);
    }
}
