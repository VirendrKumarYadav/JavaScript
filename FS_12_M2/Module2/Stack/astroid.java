package Module2.Stack;

import java.util.Scanner;
import java.util.Stack;

public class astroid {
     
    public static void main(String[] args) {
      Scanner scn= new Scanner (System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0; i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        Stack <Integer> st=new Stack<>();
        for(int ar:arr){
            if(ar>0){
                st.push(ar);
            }else{
                if (st.size() > 0) {
                    int left=st.peek();
                    int num=left+ar;
                if(num<=0)
                {
                    if(st.peek()>0)
                    {
                    st.pop();
                    }else{
                    st.push(ar);
                    }
                }
                    
                }else{    
                   st.push(ar);
                }
                
            }   
                
            }
        for(int a:st){
            System.out.print(a+" ");
        }
        
        
    }
}
