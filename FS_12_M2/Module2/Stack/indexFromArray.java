package Module2.Stack;

import java.util.Scanner;

public class indexFromArray {
     public static void main(String[] args) {
     Scanner scn=  new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        int idx=scn.nextInt();
        int ans=0;
        int lo=0; 
        int hi=arr.length;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==idx){
                ans=mid;
                  lo=mid+1;
            }else if(arr[mid]<idx){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
       
    System.out.println(ans);
    }
}
