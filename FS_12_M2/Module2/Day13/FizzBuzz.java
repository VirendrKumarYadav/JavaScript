
import java.util.*;


public class FizzBuzz {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();

        for(int i=1;i<=n;i++){
        if(i%3==0){
            System.out.print("Fizz");
        }else if(i%7==0){
            System.out.print("Buzz");
        }else if(i%3==0 && i%7==0){
            System.out.print("FizzBuzz");
        }else{
            System.out.print(i);
        }
        }  
    }
}
