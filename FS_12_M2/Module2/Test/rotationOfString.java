package Module2.Test;

public class rotationOfString {
    

    public static void main(String[] args) {
        String str="abc";
        String arr[]=str.split("");

        int lo=0;
        int hi=str.length()-1;
        while(lo<=hi){
            String temp=arr[lo];
            arr[lo]=arr[hi];
            arr[hi]=temp;
            
        }
    }
}
