package Module2.sorting;

import java.util.Scanner;

public class insersionSort {
     public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ar[]=new int[n];
        for(int a=0;a<n;a++){
            int ss=scn.nextInt();
            ar[a]=ss;
        }
    
 
        for (int i=1;i<ar.length;i++){
           for(int j=i-1;j>=0;j--){
                if(ar[j]>ar[j+1]){
               int te=ar[j+1];
                 ar[j+1]=ar[j];
                    ar[j]=te;
                }
           }
              
       }
        
        for(int k=0;k<ar.length;k++){
            System.out.print(ar[k]+" ");
        }
    }
}
