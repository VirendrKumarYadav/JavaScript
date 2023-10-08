package Module2.Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class prioriQmin {
 public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue();
        for(int i=0; i<n; i++){
            pq.add(scn.nextInt());
        }
        String sum1="";
        String sum2="";
        for(int i=1; i<=n; i++){
            if(i%2==0){
                sum1+=pq.poll();

            }else{
                sum2+=10*pq.poll();
            }
            
        }
        Long a=Long.parseLong(sum2);
        Long b=Long.parseLong(sum1);
        System.out.println(a+b);
    }
}
