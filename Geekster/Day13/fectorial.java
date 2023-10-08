import java.util.*;

public class fectorial {
    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
    int b=scn.nextInt();
    
    int div=(a-b);
    
    int ss=1;
    int s2=1;
    int j=0;
    
    for(int i=0;i<div;i++){
        s2*=(div-j); 
        j++;
    }
     j=0;
    for(int i=0;i<a;i++){
        ss*=(a-j); 
        j++;
    }
    
    System.out.println(ss/s2);
}
}
