package Module2.BinarySearch;

import java.util.Scanner;

public class binarySearch {
    
 public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();
        int ans=n;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }

        if(ans==n){
            System.out.println(-1);
            return;
        }
       System.out.println(ans);
    
    }

}
