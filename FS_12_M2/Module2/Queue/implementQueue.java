package Module2.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class implementQueue {
     public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=1;
        Queue<Integer> q=new ArrayDeque<Integer>();

        while(i<n){
            String val=scn.next();
           if(val.equals("enqueue")){
               int x=Integer.parseInt(scn.next());
               q.add(x);
           }else if(val.equals("dequeue")){
               if(q.size()>0){
                   q.remove();
               } 
           } else if(val.equals("size")){
               System.out.println(q.size());
           }else if(val.equals("display")){
               for(int a:q){
                   System.out.print(a+" ");
               }
           }
           i++;
        }
    }
}
