package Module2.twopoint;

import java.util.HashMap;
import java.util.Scanner;

public class uniqueSum2 {
      public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(); 
        int arr[] =new int [n];
        for(int i=0;i<n;i++){
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
        int sum=0;
        for(int hsNum:hs.keySet()){
            if(hs.get(hsNum)==1){
                sum+=hsNum;
            }
        }
          System.out.println(sum);
    }
}
