package Module2.BinarySearch;

import java.util.Scanner;

public class searchChar {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        char target=scn.next().charAt(0);
        int n=scn.nextInt();


        char arr[]=new char[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i]=scn.next().charAt(0);
        }
//  INPUT !
 
        char ans='@';
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                 ans=arr[mid+1]; 
               break;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else{
                ans=arr[mid+1];
                hi=mid-1;
            }
        }

        if(ans=='@'){
            System.out.println(-1);
            return;
        }
       System.out.println(ans);
    
    }
}
