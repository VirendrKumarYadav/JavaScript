package Module2.Stack;

import java.util.Scanner;
import java.util.Stack;

public class deleteConsicative {
      public static void main(String[] args) {
          Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String arr[]=new String[n];
        Stack<String> st=new Stack();
        
        for(int i=0;i<n;i++){
            arr[i]=scn.next();
        }
        for(int i=0;i<arr.length;i++){
            if(st.size()!=0){
              if(st.peek().equals(arr[i])){
                 st.pop();
             }else{
                   st.push(arr[i]);
              }
            }else{

                st.push(arr[i]);
            }
        }
        
      
           System.out.print(st.size());
        }

}
