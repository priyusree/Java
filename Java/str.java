public class str {
    public static void main(String[] args) {
        String str="priyanka";
       //oolean ispalindrome=true;
        int len=str.length();
        String[]s=str.split("");
        String sp="";
        for(int i=len-1;i>=0;i--){
            sp+=s[i];
        }
        if(sp.equals(str)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");

        }
    }

     
}
