package Module2.Moule1;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                
                if(j==0||j==n-1||(i==j||i+j==n-1)&&i<n/2+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    
    
    
    }
}
