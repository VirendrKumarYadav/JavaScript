import java.util.*;

public class solution{

public static void main(String [] arg){

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int k=scn.nextInt();
    System.out.print(n+" ");
    for(int i=n;i>=0;i-=3){
        int as=n-i*k;
        System.out.print(as+" "); 
    }   
   
    for(int i=0;i<=25;i++){
        char a  =(char)('a'+i);
       System.out.println(a);
   }
}

}