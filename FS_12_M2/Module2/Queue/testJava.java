package Module2.Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class testJava {
        public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
         Queue<String> ans=new ArrayDeque<String>();
        for(int j=0; j<n; j++)
            {
             String temp=scn.next(); 
               if(temp.equals("D")){
                  int a=Integer.parseInt(ans.remove());
                   ans.offer(Integer.toString(a*2));
               }else if(temp.equals("C")){
                   ans.poll();
               }else if(temp.equals("+")){
                   int a=Integer.parseInt(ans.remove());
                   int b=Integer.parseInt(ans.remove());
                   ans.offer(Integer.toString(a+b));
               }else{
                   ans.offer(temp);
               }
            
            }
            int sum=0;
        for(int i=0; i<ans.size(); i++){
            sum+=Integer.parseInt(ans.remove());
        }
        
        System.out.println(sum);

    }
}
