package Module2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class lastQ {
   
    static  Map<Integer,String> storeRankWithScore(int [] arr){
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int integer : arr) {
            pq.add(integer);
        }
       
        Map<Integer,String> hm=new HashMap<>();
         String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
          
        for (int i = 0; i < arr.length; i++) {
              if(i<3){
                hm.put(pq.poll(), medals[i]);
              }else{
                  hm.put(pq.poll(), String.valueOf(i+1));
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
