package Module2.sorting;

import java.util.Scanner;

public class selectionSort {
      public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ar[]=new int[n];
        for(int a=0;a<n;a++){
            int ss=scn.nextInt();
            ar[a]=ss;
        }
    
 
        for (int i=0;i<ar.length;i++){
            int min=i;
           for(int j=i;j<ar.length;j++){
                if(ar[min]>ar[j]){
               min=j;
                }
           }
              int te=ar[min];
                 ar[min]=ar[i];
                    ar[i]=te;
       }
        
        for(int k=0;k<ar.length;k++){
            System.out.print(ar[k]+" ");
        }
    }
}
