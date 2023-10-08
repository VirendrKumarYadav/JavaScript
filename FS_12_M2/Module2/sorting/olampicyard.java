package Module2.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class olampicyard {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }  
        Arrays.sort(arr);
        int l=0;
        int r=n-1;
        int j=0;
        while(j<n-1){
            if(j%2==0){
                arr[l]=0;
                l++;
            }else{
                arr[r]=0;
                r--;
            }
            j++;
        }
        for (int i : arr) {
            if(i!=0){
                System.out.println(i);
                break;
            }
        }
    }
}
