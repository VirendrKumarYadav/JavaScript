package Module2.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AbleToEat {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> st = new LinkedList<>(); 
        Queue<Integer> sd = new LinkedList<>();
        int count0=0;
        int count1=0;
        for(int i=0 ; i<n ; i++){
            int no=sc.nextInt();
              st.add(no);
            if(no==0){
                count0+=1;
            }else{
                count1+=1;
            }
        }
        
        
        for(int i=0 ; i<n ; i++){
            int no=sc.nextInt();
              sd.add(no);  
            }
        
        while(st.size()!=0){
            if(st.peek()==sd.peek()){
                int stNo=st.remove();
                sd.remove();
                if(stNo==0)
                count0--;
                else 
                count1--;
                
            }else{
                st.add(st.remove());
            }
            if(count0==0 && st.size()>0){
               System.out.println(st.size()); 
            }
        }
       System.out.println(count0);
        
    }
}
