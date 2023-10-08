import java.util.*;

public class fectorial {
    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
    int b=scn.nextInt();
    
    int div=(a-b);
    int num=a/div;
    
    int ss=1;
    int j=0;
    for(int i=0;i<num;i++){
        ss*=(num-j); 
        j++;
    }
    
    System.out.println(ss);
}
}
