package Module2.Test;

import java.util.Scanner;

public class longestPrefix {
     public static void main(String[] args) {
   Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
       String []arr=new String [n];
        int min=Integer.MAX_VALUE;
        int length=0;
        String minLengthSt="";
        for(int i=0; i<n;i++){
            arr[i]=scn.next();
             length=arr[i].length();
            if(min>length){
                min=length;
                minLengthSt=arr[i];
            }         
        }
       
        int word=0;
        int ansInd=Integer.MAX_VALUE;
while(word<n){
     int ind=0;
    for(int i=0; i<minLengthSt.length();i++){
        if(minLengthSt.charAt(i)==arr[word].charAt(i)){
            ind++;
        }else{
            ansInd=Math.min(ansInd, ind);
            break;
        }
        
    }
    
     word++;
}
       


    for (int s = 0; s <ansInd; s++) {
          System.out.print(minLengthSt.charAt(s));
    }
      
       
    }
}
