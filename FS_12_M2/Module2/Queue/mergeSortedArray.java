package Module2.Queue;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class mergeSortedArray {
       public static void main(String[] args) {
      Scanner scn= new Scanner(System.in);
        int in=scn.nextInt();
        PriorityQueue<Integer> q=new PriorityQueue();
        int i=0; 
        while(i<in){
            int l=scn.nextInt();
            int j=0;

            while(j<l){
            q.offer(scn.nextInt());    
                j++;
            }
            i++;
        }
           
        for (int j = 0; j <q.size(); j++) {
          System.out.print(q.poll()+" ");  
        }
        
    }
}
