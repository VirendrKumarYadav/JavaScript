package Module2.BinarySearch;

import java.util.Scanner;

public class bananaChallange {

  public static int  minEatBananaSpeed(int []arr,int h){
int minSpeed=0;
     int maxSpeed=Integer.MIN_VALUE;
for(int val:arr){
    maxSpeed=Math.max(val, maxSpeed);
}

int left=1;
int right=maxSpeed;
while(left<=right){
    int mid=left+(right-left)/2;
     if(isPossible(arr,mid,h)){
        minSpeed=mid;
        right=mid-1;
     }else{
        left=mid+1; 
     }

}

    return minSpeed;
    }

    public static boolean isPossible(int arr[],int mid,int hour){
      int h=0;
      for (int i = 0; i < arr.length; i++) {
        h+=(arr[i]+mid-1)/mid;
        if(h>hour){
          return false;
        }
      } 

        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }
        int hours=scn.nextInt();

        int ans=minEatBananaSpeed(arr, hours);
               System.out.println(ans);
    }
}
