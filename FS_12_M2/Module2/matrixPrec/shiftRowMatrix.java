package Module2.matrixPrec;

import java.util.Scanner;

public class shiftRowMatrix {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
         int row=scn.nextInt();
       int arr [][]=new int [row][row];
       for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr.length; j++) {
              arr[i][j]= scn.nextInt();
          }
       }

       int k=scn.nextInt(); 
       for (int i = 0; i < row; i++) {
           for (int j = k; j < row; j++) {
                System.out.print(arr[i][j]+" ");
           }
           for (int j = 0; j < k; j++) {
                 System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
    }
}
