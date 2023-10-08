package Module2.Stack;

import java.util.Scanner;
import java.util.Stack;

public class tempretureIncreseJust {
    
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int ans[]=new int [n]; 
        Stack<Integer>st=new Stack<>();
            for(int i=0; i<n; i++){       
             while(st.size()>0 && arr[st.peek()]<arr[i]){
                 ans[st.peek()]=i-st.peek();  
                 st.pop();
              }
                
            // if(st.size()==0){
            //     st.push(arr[i]);
            // }
          
            st.push(i);
        }
        
        for(int a:ans){
            System.out.print(a+" ");
        }
       
    }
}
