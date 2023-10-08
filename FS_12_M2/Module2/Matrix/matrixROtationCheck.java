package Module2.Matrix;

import java.util.Scanner;

public class matrixROtationCheck {
     public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        int row =scn.nextInt();
        int clm =row;
        
          int [][]arr=new int [row][clm];
            for(int i=0;i<row;i++){
              for(int j=0;j<clm;j++){
                 arr[i][j]=scn.nextInt();
              }
          }
          int check=arr[0][0];
        for(int i=1;i<row;i++){ 
              if( arr[i][i]!=check || arr[i][0]!=arr[i-1][clm-1]){
               System.out.println("NO");
                 return;
               } 
          }
            System.out.println("YES");
        
        
        
    }
}
