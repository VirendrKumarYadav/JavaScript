package Module2.Test;

import java.util.Scanner;

public class anagram {
      public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);

           String str=scn.nextLine();
           String target=scn.nextLine();
        
                String arr[]=getAnagram(target);
                for (int i = 0; i < arr.length; i++) {
                    if(str.indexOf(arr[i])!=-1){
                        System.out.print(str.indexOf(arr[i]));
                    }
                }

       // System.out.println(str.indexOf("bac"));
        
    }

    public static String [] getAnagram(String str){
   String [] arr= new String [str.length()];
   int num=0;
   for (int i = 0; i <=str.length(); i++) {
      String subStr="";
    for (int j = i; j <= str.length(); j++) {
           subStr=str.substring(i, j);
           if(subStr.length()==3){
              arr[num]=subStr;
              num++;
           }
    }
   }

        return arr;
    }
}
