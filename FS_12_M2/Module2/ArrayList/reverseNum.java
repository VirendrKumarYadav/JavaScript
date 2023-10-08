package Module2.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseNum {
     public static String removeLeadingZeroes(String str) {
      String strPattern = "^0+(?!$)";
      str = str.replaceAll(strPattern, "");
      return str;
   }
      public static void printReverse(int num){
       int div=1;

      
        ArrayList <Integer>list=new ArrayList<>();
        
        while(div>0){
            div=num/10;
            int rem=num%10;
            list.add(rem);
            num=div;
            
         }
      for(int a:list){
          System.out.print(a);
      }

        
    }
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        for(int num:arr){
            printReverse(num); 
            System.out.println();
        }
       
    
    }
}
