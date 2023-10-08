package Module2.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class olympiyardSelection {
      public static void main(String[] args) {
   Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<Integer> list=new ArrayList();
        for(int i=0; i<n; i++){
            list.add(scn.nextInt());
        }
        Collections.sort(list);
        int  j=0;
        int l=0;
        int r=n-1;
        while(j<n-2){
            if(j%2==0){
                list.remove(l);
                l++;
            }else{
                list.remove(r);
                r--;
            }
            j++;
        }
        for(int a:list){
        System.out.println(a);
    }
  }
}
