package Module2.arraySort;
import java.util.Scanner;

public class deduplication {
    static int countDeDuplecation(int arr[]){
        int count=0, maxCount=0;
         int start=0;
         for(int i=0; i<arr.length; i+=start){
              count=0;
             
             for(int j=i; j<arr.length;j++){
                 if(arr[i]==arr[j]){
                         count++;
                 }
             }
              start=count;
             if(count>2){
                 maxCount+=2;
             }else{
                 maxCount+=count;
             }
         }
         return maxCount;
     }
       public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
           int n=scn.nextInt();
           int arr[]=new int[n];
           for(int i=0; i<n; i++){
               arr[i]=scn.nextInt();
           }
           int ans=countDeDuplecation(arr);
           System.out.println(ans);
       }
}
