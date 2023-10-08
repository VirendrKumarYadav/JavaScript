package Module2.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class oddOccurance {
      public static void main(String[] args) {
      Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        for(int a:arr){
            if(hs.containsKey(a)){
                int val=hs.get(a);
                 hs.put(a,val+1);
            }else{
                hs.put(a,1);
            }
        }
        for(int num:hs.keySet()){

            if(hs.get(num)%2==1){
                System.out.print(num);
            }
        }
    }
}
