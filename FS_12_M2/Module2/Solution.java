package Module2;

import java.util.Scanner;

public class Solution {
       public static boolean isPressent(int arr[][],int target){ 
        int cmin=0;
        int cmax=arr[0].length-1;
        int rmin=0; 
        int rmax=arr.length-1;
        //column
        for(int i=cmin; i<=cmax; i++){
            if(arr[rmin][i]!=target){
                return false;
            }
        }
        //row
        for(int i=rmin; i<=rmax; i++){
            if(arr[rmin][i]!=target){
                return false;
            }
        }
        //left diogonal 
        for(int i=rmin; i<=rmax; i++){
            for(int j=cmin; j<=cmax; j++){
            if(i==j&& arr[i][j]!=target){
                return false;
            }
         }
        }    
            //Right diogonal
        for(int i=rmax; i>=rmin; i--){
            for(int j=cmax; j>=cmin; j--){
            if(i==j&& arr[i][j]!=target){
                return false;
            }
        }
    }
           return true;
}        
  
    public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int [n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        boolean status=false;
        status = isPressent(arr,0);
        if(status){
            System.out.println("Games End");
        }else{
            status = isPressent(arr,1);
             if(status){
            System.out.println("Games End");
            }else{
                  System.out.println("Draw");
             }
        }
        
    }
   
}
