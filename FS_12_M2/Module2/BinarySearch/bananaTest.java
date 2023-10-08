package Module2.BinarySearch;

import java.util.Scanner;

public class bananaTest {
    
    public static boolean isPossible(int arr[],int hr,int target){
        int cHr=0;
    for(int i=0; i<arr.length;i++){ 
        cHr+=(arr[i]+target-1)/target;
        if(cHr>hr){
            return false;
        }
    }
        return true;
    }
    
    public static int minimumSpeedToEat(int arr[],int hrs){
        
        int maxSpeed=0;
        for(int as:arr){
            maxSpeed=Math.max(maxSpeed,as);
        }
        int ans=0;
        int lo=1;
        int hi=maxSpeed;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isPossible(arr,hrs,mid)){
                 ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
    
    
    
    public static void main(String[] args) {
     Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int hrs=scn.nextInt();
        
        int ans=minimumSpeedToEat(arr,hrs);
        System.out.println(ans);
        
        }
}
