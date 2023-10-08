import java.util.*;

public class Jumping {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char ch=  scn.next().charAt(0);
        if(ch>='a'&&ch<='z'){
      
            if(ch>='a'&&ch<='w'){
        int chr=(int)ch+3;
        System.out.println((char)chr);
        }else {
            System.out.println("Can't jump");
        }
            
        }else if(ch>='A'&&ch<='Z'){
        if(ch>='D'&&ch<='Z'){}
           int chr=(int)ch-3;
        System.out.println((char)chr);
        }else {
            System.out.println("Can't jump");
        } 
        
        }
    
}
