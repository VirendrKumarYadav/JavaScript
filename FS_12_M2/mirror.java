import java.util.Scanner;

public class mirror {
     public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]= new int [n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
         int m=scn.nextInt();
         int arr1[]= new int [m];
        for(int i=0; i<n; i++){
            arr1[i]=scn.nextInt();
        }
        
        int i=0;
        int j=0; 
        while(i<arr.length){
            j=0;
            while(j<arr1.length){
            if(arr[i]+arr1[j]==0){
                System.out.print(arr[i]+" ");
            }
                j++;
            }
            i++;
        }
        
    }
}
