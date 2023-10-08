package Module2.Stack;

import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
     public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        char [] arr=str.toCharArray();
        Stack <Character> st=new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='('){
                st.push('(');
            }else{
                if(st.size()>0){
                st.pop();
                }else{
                    System.out.println("false");
                    return;
                }
            }
        }
        if(st.size()>0){
             System.out.println("false");
        }else{
            System.out.println("true");    
        }
    }
}
