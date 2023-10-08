package Module2.BinarySearch;

import java.util.Scanner;

public class squreRoot {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int ans=0;
        int lo=0;
        int hi=n/2;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mid*mid==n){
                ans=mid;
                break;

            }
            else if(mid*mid<n){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }

    System.out.println(ans);
    
    }
}
