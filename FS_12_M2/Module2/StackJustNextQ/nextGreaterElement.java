package Module2.StackJustNextQ;

import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         int []arr =new int [n];
         for (int i = 0; i < arr.length; i++) {
              arr[i]=scn.nextInt();
         }
           
         Stack <Integer> st=new Stack<Integer>();
        
         for (int i = 0; i < arr.length; i++) {
          while(st.size()>0 && st.peek()<=arr[i]) {
            st.pop();
          }  
          if(st.size()==0){
            System.out.print("-1"+" ");
          }else{
            System.out.print(st.peek());
          }
          st.push(i);
         }
         
    }
}
