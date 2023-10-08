package Module2.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class frequencyChar {
    public static void main(String[] args) {
        
    Scanner scn= new Scanner(System.in);
        String str=scn.nextLine();
           char arr[]=str.toCharArray();



        int expFreq=scn.nextInt();
        HashMap<Character,Integer> hs=new HashMap();
        
        for(char a:arr){
            if(hs.containsKey(a)){
                int val=hs.get(a);
                 hs.put(a,val+1);
            }else{
                hs.put(a,1);
            }
        }
        
        for(char num:hs.keySet()){
            if(hs.get(num)>=expFreq){
                System.out.print(num+" ");
            }
        }
    }
}
