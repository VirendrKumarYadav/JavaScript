package Module2.Stack;

import java.util.Scanner;
import java.util.Stack;

public class stock_Spanner {
    
       public static void main(String[] args) {
         Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0; i<n;i++){
            arr[i]=scn.nextInt();
        }
      Stack<Integer>st=new Stack<>();
        for(int i=0; i<n; i++){
           while(st.size()>0 && arr[st.peek()]<=arr[i]){
                 st.pop();
           }
            
            if(st.size()==0){
                System.out.print(1+i+" ");
            }else{
               System.out.print(i-st.peek()+" ");
            }
            st.push(i);
            System.out.println(st.peek());
        }
     
    }
}
