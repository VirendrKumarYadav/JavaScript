import java.util.*;

public class rotate{

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
         int n=scn.nextInt();
         int arr[]=new int [n];
         for(int i=0; i<n; i++){
             arr[i]=scn.nextInt();
         }
         int k=scn.nextInt();
         
         reverse(arr,n-k,n-1);
         reverse(arr,0,n-k-1);
         reverse(arr, 0, n-1);
             for(int i=0; i<n; i++){
                 System.out.print(arr[i]+" ");
             }
         
     }
     public static void reverse(int [] arr, int l, int r){
         while(l<=r){
         int temp=arr[l];
         arr[l]=arr[r];
         arr[r]=temp;
         l++;
         r--;
     }
         
     }
     

}