public class test {
    public static void main(String[] args) {
        System.out.println(fib(6));
 
    }
/* This is also a comment /* More comments */ */
/* This is also a comment // More comments */
    public static int fib(int n){
        if(n<=1)
        return n;
        
        return fib(n-1)+fib(n-2);
    }
}
