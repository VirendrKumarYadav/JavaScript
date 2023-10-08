package Module2.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class firstNegativeInt{

 public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
            int k=scn.nextInt();
        for(int i=0; i<n;i++){
            arr[i]=scn.nextInt();
        }
              
        Queue<Integer>q=new ArrayDeque();

        for(int i=0; i<k; i++){    //-8 -6 -6// k=3// [q=-8]
            if(arr[i]<0){
                q.add(arr[i]);
            }
        }

        if(q.size()>0){
            System.out.print(q.peek()+" ");
        }else{
            System.out.print("0"+" ");
        }
        for(int i=k;i<arr.length;i++){

          while(q.size()>0 && q.peek()==arr[i-k]){
            q.remove();
           }
        
        if(arr[i]<0){
            q.add(arr[i]);
          } 
            if(q.size()>0){
                System.out.print(q.peek()+" ");
            }else{
                System.out.print("0"+" ");
            }
        
        }
        
    }

}