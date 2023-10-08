public class secoundHighest {
    
public static void main(String[] args) {
    int a=10;
    int b=12;
    int c=15;

    
    // 12 13 14
    if(a>=b && a>=c){

        if(b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }else if(b>=c && b>=a){
        if(a>c){
            System.out.println(a);
        }else{
            System.out.println(c);
        }
    }else if(c>=a && c>=b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}

}
