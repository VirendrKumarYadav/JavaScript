package Module2.String;

import java.util.Scanner;


public class HW_CountConsecutive_Ones {
    
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String str=scn.nextLine();
        String [] arr=str.split("");

        int i=0;
        int count=0;
        int ans=0;
         while(i<arr.length){
            if(arr[i].equals("1")){
                count++;

            }else{
                ans=Math.max(ans,count);  
                count=0;
            }
            i++;
        }
         ans=Math.max(ans,count);
         System.out.println(ans);
    }
}
