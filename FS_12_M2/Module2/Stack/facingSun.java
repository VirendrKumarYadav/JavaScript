package Module2.Stack;

import java.util.Scanner;
import java.util.Stack;

public class facingSun {
     public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n; i++){
            arr[i]=scn.nextInt();
        }
        int count=0;
        Stack<Integer> st=new Stack<>();
        for(int a:arr){
            if(st.size()==0){
               st.push(a);
                count++;
            }else if(st.peek()<=a){
                count++;
                st.pop();
                st.push(a);
                
            }
        }
        System.out.print(count);
    }
}
