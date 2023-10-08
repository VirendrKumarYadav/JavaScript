package Module2.String;

import java.util.Scanner;

public class longestPlendromeSubString {
     public static boolean isPlendrome(String str){
        String [] arr=str.split("");
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(!arr[left].equals(arr[right])){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int i=0;
       
        String ans="";
        int maxLen=0;
        while(i<str.length()){
            int j=i+1;
            while(j<str.length()){
                 String subStr="";
                for(int a=i;a<j;a++){
                    subStr+=str.charAt(a);
                }
                System.out.println(subStr);
                 if(isPlendrome(subStr) && maxLen<subStr.length()){
                     ans=subStr;
                     maxLen=subStr.length();
                 }
                j++;
            }
            i++;
        }
        System.out.println(ans);
    }
}
