
import java.util.*;

public class reverseArrayPrint {

public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int size=n;
        int arr[]=new int [size];
         int i=0;
        while(i<n){
            int t=scn.nextInt();
            arr[i]=i;
            i++;
        }
        
        for(int j=size-1;j>0;j--){
            System.out.print(arr[j]+" ");
        }
}

}