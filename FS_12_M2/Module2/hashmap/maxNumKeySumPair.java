package Module2.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class maxNumKeySumPair {
      public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
         
        // HashMap <Integer , Integer> hm=new HashMap();
          ArrayList <Integer> list =new ArrayList<Integer>();
        for(int i=0; i<n; i++){
          int val=scn.nextInt();
            list.add(val);
        }
        int target=scn.nextInt();
       int count=0;
         for(int num: list){
            
            int prVal=target-num;
             if(list.contains(prVal)){
                //  list.remove(prVal);
                 list.remove(num);
                 count+=2;
             }
         }
        
         System.out.println(count);
        
    }
}
