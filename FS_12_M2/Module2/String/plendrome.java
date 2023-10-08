package Module2.String;

import java.util.Scanner;

public class plendrome {
    public static void main(String[] args) {
      String str=new Scanner(System.in).nextLine();
      str=str.toLowerCase();
        String [] arr=str.split("");
         int i=0;
        String ans="";
        while(i<arr.length){
            if(Character.isDigit(arr[i].charAt(0))|| Character.isAlphabetic(arr[i].charAt(0))){
                ans+=arr[i];
            }
            i++;
        }
       String finalAns="";
        for (int j = ans.length()-1; j >=0; j--) {
            finalAns+=ans.charAt(j);
        }
        if(ans.equals(finalAns)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
