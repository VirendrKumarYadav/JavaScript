package Module2.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class weakRow {
      public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int k=scn.nextInt();
        int arr[][]=new int [m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        Map<Integer,Integer> tm=new HashMap<Integer,Integer>();
         ArrayList<Integer> list= new ArrayList<Integer>();

        int i=0;
        while(i<m){
           int sum=0;
         for(int j=0; j<n; j++){
            sum+=arr[i][j];
         }
            tm.put(i,sum);
            list.add(sum);
        i++;
        }
       Collections.sort(list);
        for(int s=0; s<k; s++){ 
            System.out.print(tm.get(list.get(s))+" ");
        }
        
    }
}
