package Module2.Stack;

import java.util.Scanner;
import java.util.Stack;

public class postfix{


    //23456+_*/
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    String str=scn.next();
   int ans= calcualtePostFix(str);
   System.out.println(ans);

}

private static int calcualtePostFix(String str) {
    Stack <Integer> st=new Stack<>();
    for (int i = 0; i < str.length(); i++) {
    
    char ch=str.charAt(i);
     switch(ch){

        case '+':{
            int b=st.pop();
            int a=st.pop();
            int ans=a+b;
            st.push(ans);
            break;
        }
        case '-':{
             int b=st.pop();
            int a=st.pop();
            int ans=a-b;
              st.push(ans);
            break;
        }
         case '*':{
             int b=st.pop();
            int a=st.pop();
            int ans=a*b;
              st.push(ans);
            break;
        }
         case '/':{
             int b=st.pop();
            int a=st.pop();
            int ans=a/b;
              st.push(ans);
            break;
        }
        default :{
             st.push(ch -'0');
        }
    }
        
}  
    return st.pop();

}

}