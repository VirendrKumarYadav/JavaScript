package Module2.Moule1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
            for(int i=0; i<n; i++){
                int num= scn.nextInt();
                if(num<=15){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
    }
}
