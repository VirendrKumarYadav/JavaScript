package Module2;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNum {
    public static void main(String[] args) {
          int num=new Scanner(System.in).nextInt();
        
 HashSet<Integer> st = new HashSet<>();
        while(num>1){
            int sumOfSq=0;
            int div=num;
        while(div>0){
            int rem=num%10;
            div=num/10;
            sumOfSq+=rem*rem;
            num=div;
        }
        num=sumOfSq;
        if(st.contains(sumOfSq)){
            break;
        }
        st.add(sumOfSq);
        
    }
    if(num!=1){
        System.out.println(false);
    }else{
        System.out.println(true);
    }
    }
}
