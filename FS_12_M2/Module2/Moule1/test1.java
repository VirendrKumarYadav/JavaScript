package Module2.Moule1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
              zeroPat(n);
    }
    static void zeroPat(int n){
       
            
        for(int i=0; i<n; i++){
          for (int j = i; j <n; j++) {
            if( j%2==0){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
        }
        System.out.println();
    }
    }
}
