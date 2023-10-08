package Module2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class rekativeRansk {
      static  Map<Integer,String> storeRankWithScore(int [] arr){
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>    
             (Collections.reverseOrder());
        
       for (int integer : arr) {
            pq.add(integer);
        }
       
        Map<Integer,String> hm=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
             int val=pq.remove();
            if(i==0){
                hm.put(val,"Gold Medal");
            }else if(i==1){
                hm.put(val,"Silver Medal");
            }else if(i==2){
                  hm.put(val,"Bronze Medal");
              }else{
                if(!hm.containsKey(val))
                  hm.put(val, String.valueOf(i+1));
              }
        }
        return hm;
    }
    public static void main(String[] args) {
      Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
       int arr[]=new int[n];
        for(int i=0; i<n;i++){
          arr[i]=scn.nextInt();        
        }  
        
        int i=0; 
        int size=arr.length-1;
        Map<Integer,String> pr=storeRankWithScore(arr);
        while(i<n){
            int val=arr[i];
            System.out.print(pr.get(val)+" ");
           
          i++;
        }
    
    }
}
