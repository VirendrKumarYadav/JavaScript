package Module2.String;


import java.util.*;

public class PowerOfString{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       String str=scn.nextLine();

       String ch="";
       int count=0;
       int sb_length=1;
       String sub_str="";
       
       for(int i=0;i<=str.length();i++){
            for(int j=i;j<=str.length();j++){
                String check=str.substring(i, j);
                if(check.startsWith("A") && check.endsWith("A") && check.length()>1 && check.length()<=str.length()){
                count++;
                 if(sb_length<check.length()){
                     sb_length=check.length();
                     sub_str=check;
                 }   
                }
            }
        }
           
        if(count>1){
       System.out.println(count);
       System.out.println(sb_length);
       System.out.println(sub_str);
       }else{
          System.out.println(-1); 
       }
    }



}