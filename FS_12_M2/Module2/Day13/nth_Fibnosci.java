import java.util.*;

public class nth_Fibnosci {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
          int a=0;
          int b=1;
          int c=0;
          int i=1; 
         while(i<=n){
             c=a+b;
             a=b;
             b=c;
             i++;
         }
          System.out.println(a);
      }
}
