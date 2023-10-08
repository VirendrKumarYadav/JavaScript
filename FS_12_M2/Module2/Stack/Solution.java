package Module2.Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    ArrayList<String> list;
    public Solution(){
        list=new ArrayList<>();
    }
    
    public String peak(){
        String peak="";
        if(list.size()>0){
             peak=list.get(list.size());
        }
       return peak;
    }
    
     public String pop(){
        String pop="";
        if(list.size()>0){
             pop=list.get(list.size()-1);
            list.remove(list.size()-1);
        }
       return pop;
    }
    public void push(String num){
        list.add(num);
    }
     public int size(){
      return list.size();
    }
    public void display(){
        if(list.size()>0){
            for(String num:list){
                System.out.print(num+" ");
            }
               System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        Solution sl=new Solution();
       Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0; i<n;i++){
            String cmd=scn.next();
            
            if(cmd.equals("push")){
                sl.push(scn.next());
            }else if(cmd.equals("display")){
                sl.display();
             
            }else if(cmd.equals("pop")){
                sl.pop();
            }else if(cmd.equals("size")){
                System.out.print(sl.size());
            }
            
        }
    }
}