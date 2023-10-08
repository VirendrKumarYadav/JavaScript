package Module2.BinarySearch;

import java.util.Scanner;

public class painterPbl {
      public static void main(String[] args) {
     Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int arr []=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int painter=scn.nextInt();
        int ans=minPainterNeeded(arr,painter);
        System.out.println(ans);
    } 
        public static int minPainterNeeded(int arr[],int k){
            int lo=0;
            int hi=0;
            for(int i=0;i<arr.length;i++){
                lo=Math.max(lo,arr[i]);
                 hi+=arr[i]; 
            }
           int ans=0;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
              if(ifpossible(arr, k,mid)){
                  ans=mid;
                  hi=mid-1;
              }else{
                  lo=mid+1;
              }
            }
           return ans; 
        }
        public static boolean ifpossible(int arr[],int k,int limit){
            int sum=0;
            int painter=1;
            for(int val:arr){
                if(val+sum<=limit){
                    sum+=val;
                }else{
                    sum=val;
                    painter++;
                }
            }
            return painter<=k;
        }
}
