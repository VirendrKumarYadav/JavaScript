package Module2;

import java.util.Scanner;

public class spiral_2 {
    public static void main(String[] args) {
      Scanner scn =new Scanner(System.in);
        int row=scn.nextInt();
        int col=scn.nextInt();
        int arr[][]=new int [row][col];
            
            for(int i=0; i<row; i++){
            for(int j=0; j<col;j++){
                arr[i][j]=scn.nextInt();
            }
        } 

        int total=row*col;
        int cmin=0;
        int cmax=arr[0].length-1;
        int rmin=0;
        int rmax=arr.length-1;
        int temp=0;
        int pre=arr[0][0];
        int count=0;

         while(count<total){
            //left to right;
            for(int i=cmin; i<=cmax && count<total;i++){
                temp=arr[rmin][i];
                arr[rmin][i]=pre;
                pre=temp;
                count++;
            }
            rmin++;
           
            // top to bottom
             for(int i=rmin; i<=rmax && count<total;i++){
                 temp=arr[i][cmax];
                arr[i][cmax]=pre;
                pre=temp;
                count++;
            }
            cmax--;
           

            // right to left
              for(int i=cmax; i>=cmin && count<total;i--){
                temp=arr[rmax][i];
                arr[rmax][i]=pre;
                pre=temp;
                count++;
            }
            rmax--;
            // // down to up
            
             for(int i=rmax; i>=rmin && count<total;i--){
               temp=arr[i][cmin];
                arr[i][cmin]=pre;
                pre=temp;
                count++;
            }
            cmin++;

            
        }
        arr[0][0]=pre;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        } 
    
    }

}

