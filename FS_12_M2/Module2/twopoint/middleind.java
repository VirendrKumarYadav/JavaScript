package Module2.twopoint;

import java.util.Scanner;

public class middleind {
     public static void main(String[] args) {
       Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        int idx=0;
         idx=findMiddleIndex(arr);
        System.out.println(idx);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    public static int findMiddleIndex(int[] nums) {
       int totalsum=0;
       int leftsum=0;

       for(int i=0;i<nums.length;i++){
       totalsum=totalsum+nums[i];
       }

    for(int i=0;i<nums.length;i++){
        
         
        if((2*leftsum)==(totalsum-nums[i])){
           
            return i;
            
        }
        leftsum=leftsum+nums[i];
    }
   
    return -1;
  }
}
