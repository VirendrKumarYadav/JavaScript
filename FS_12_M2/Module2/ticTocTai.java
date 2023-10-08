package Module2;

import java.util.Scanner;



public class ticTocTai {

public static boolean isPressent(int[][] ch, int target, int row, int col) {
       int rows = ch.length-1;
       int cols = ch[0].length-1;
      // int len = word.length();
        boolean found = true;
       
       // left to right

       if (col  <= cols) {
            found = true;
           for (int i = 0; i <= cols; i++) {
               if (ch[row][i] != target) {
                   found = false;
                   break;
               }
           }
           if (found) {
               return true;
           }
       }

       // top down
       if (row <= rows) {
            found = true;
           for (int i = 0; i <=rows; i++) {
               if (ch[i][col] !=target) {
                   found = false;
                   break;
               }
           }
           if (found) {
               return true;
           }
       }
         //left diogonal 
         if(row<=rows && col<=cols){
          found=true;
        for(int i=0; i<=rows; i++){
            for(int j=0; j<=cols; j++){
            if(i==j && ch[i][j]!=target &&  row!=i ){
                found=false;
                break;
            }
         }
        }
         if (found) {
               return true;
           }
    }

         //Right diogonal
     if(row<=rows && col<=cols){
             found =true;
         for(int i=rows; i>=row; i--){
            for(int j=cols; j>=col; j--){
            if(i==j&& ch[i][j]!=target && col!=j){
                found=false;
                break;
            }
        }
    }
           if (found) {
               return true;
           }

    }
    return found;
    
}

   public static boolean isPresChecks(int [][] arr ) {
     boolean status=false;
        for(int t=0; t<=1;t++){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                 status = isPressent(arr,t,i,j);
                 if(status){
                  return true ;
                 }
            }
       }
    }
       return status;
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
    
       if(isPresChecks(arr)){
            System.out.println("Games End");

            }else{
                  System.out.println("Draw");
             }
        
    }

}
