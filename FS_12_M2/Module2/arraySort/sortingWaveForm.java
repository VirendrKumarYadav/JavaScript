package Module2.arraySort;

import java.io.*;
import java.util.*;

public class sortingWaveForm {
    public static void main(String[] args) {
     Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        Integer arr[]=new Integer [n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        int left[]=new int [n];
        int right[]=new int [n];
        for(int i=0; i<n; i++){
            if(i%2==0){
                left[i]=arr[i];
            }else{
                right[i]=arr[i];
            } 
        }
        
        for(int i=0; i<n; i++){
            if(i%2==0){
                System.out.print(right[i]+" ");
            }else{
                System.out.print(left[i]+" ");
            }
        }
    }
}
