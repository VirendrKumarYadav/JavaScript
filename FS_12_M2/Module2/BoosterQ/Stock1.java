package Module2.BoosterQ;

import java.util.Scanner;

public class Stock1 {
     public static int maxProfit(int[] prices) {
        int res=0,crtMin=100000;
        for(int price:prices){
         res=Math.max(res,price-crtMin); 
         crtMin=Math.min(crtMin,price);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        System.out.println(maxProfit(arr));
    }
}
