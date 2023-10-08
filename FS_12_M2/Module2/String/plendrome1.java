package Module2.String;

public class plendrome1 {
    public static void main(String[] args) {
        
       System.out.println( isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static  boolean isPalindrome(String s) {
        String ans="";
        String exp="";
        for(int i=0; i<s.length(); i++){
            char ch =s.charAt(i);
            if(ch>='A'&& ch<='Z'){
                int val=(int)ch+32;
                  exp+=(char)val;
            }else if(ch>='a'&& ch<='z'){
                  exp+=ch;
            }
        }

        for(int i=exp.length()-1; i>=0; i--){
             char ch=exp.charAt(i);
            if(ch>='A'&& ch<='Z'){
                int val=(int)ch+32;
                 ans+=(char)val;
            }else if(ch>='a'&& ch<='z'){
                ans+=ch;
            }
        }
        if(exp.equals(ans)){
           return true;
        }else{
            return false;
        }
    }

}
