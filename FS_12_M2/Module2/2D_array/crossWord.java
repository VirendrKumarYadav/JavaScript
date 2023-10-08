

import java.util.Scanner;

public class crossWord {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         scn.nextLine();
         char [][]arr=new char [n][n];
         for (int i = 0; i < arr.length; i++) {
            String str=scn.nextLine();
                String [] strArr=str.split(" ");
                
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=strArr[j].charAt(0);
            
            }
         }
           String word =scn.nextLine();

           boolean ans=isWordPresent(arr,word);
           System.out.println(ans);
    
    }

    public static boolean isWordPresent(int [][] arr, String word){
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr.length; j++) {
        if(arr[i][j]==word.charAt(0)){
            boolean found=isFound(arr,word,i,j);
            if(found){
                return false;
            }
        }
    }
}
              return false;
    }

   public static boolean isFound(int [][] arr,String word,int row,int col){
        int rows=arr.length;
        int cols=arr[0].length;
        int word_len=word.length();

        // left to right
        if(col+word_len<=cols){

        }
            
        // top to bottom

        if(row+word_len<=rows){

        }

        //north west to south east
        if(col+word_len<=cols && row+word_len<=rows){

        }
      

        // north east to south west
        if(row+word_len<=rows && col-word_len+1>=0){

        }
    return false;
   }

}
