package Module2.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class mergeTwoArray {
      public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
      int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=scn.nextInt();
            
        }
        int m=scn.nextInt();
         int arr2[]=new int[m];
        for(int i=0;i<n;i++){
             arr2[i]=scn.nextInt();
        }
       
       int i=0; int j=0;
       ArrayList<Integer> ans=new ArrayList();
       while(i<arr1.length){
           if(arr1[i]<arr2[j]){
               ans.add(arr1[i]);
               i++;
           }else{
               ans.add(arr2[j]);
               j++;
           }
        }
           while(i<arr1.length){
               ans.add(arr1[i]);
               i++;
           }
           
            while(j<arr2.length){
               ans.add(arr2[j]);
                j++;
           }
       
       
       
       ArrayList<Integer> unique=new ArrayList();
          for (int k = 0; k < ans.size(); k++) {
              if(!unique.contains(ans.get(k))){
                  unique.add(ans.get(k));
              }
          }
          
          for(int l=0;l<unique.size();l++){
            System.out.print(unique.get(l)+" ");
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
