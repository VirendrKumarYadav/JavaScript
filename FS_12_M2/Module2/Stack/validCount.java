package Module2.Stack;

import java.util.Scanner;
import java.util.Stack;

public class validCount {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        char [] arr=str.toCharArray();
        Stack <Character> st=new Stack<>();
      int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='('){
                st.push('(');
            }else{
                if(st.size()>0){
                st.pop();
                }else{
                    count++;
                }
            }
        }
        if(st.size()<=0){
             System.out.println(count);
        }else{
            System.out.println(count+st.size());    
        }
    }
}
