package Module2.StackJustNextQ;

import java.util.Scanner;
import java.util.Stack;

public class LargetstAreaOfHistrogram {


    public static void main(String[] args) {
        
    Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int arr []=new int [n]; //hight
   for(int i=0; i<n;i++){
     arr[i]=scn.nextInt();
    }

      int left []=new int [n];
        int right []=new int [n];

        Stack<Integer> st=new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.size()==0){
                left[i]=i+1;
            }else{
                left[i]=i-st.peek();
            }
            st.push(i);

        }


        st=new Stack<Integer>();
        for (int i = n-1; i >=0; i--) {
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.size()==0){
                right[i]=n-i;
            }else{
                right[i]=st.peek()-i;
            }
            st.push(i);
        }

        int maxArea=0;
        for (int i = 0; i < arr.length; i++) {
           int width=left[i] +right[i]-1;
           int area=arr[i]*width;
           maxArea=Math.max(maxArea, area) ;          
        }
        System.out.println(maxArea);
}
}
