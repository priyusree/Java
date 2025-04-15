import java.util.*;
public class ccc {
    public static boolean palindrome(int num){
        int sum=0,original=num;
        while(num!=0){
            int rev=num%10;
            sum=sum*10+rev;
            num/=10;
        }
        return original==sum;

    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int s=sn.nextInt();
        int e=sn.nextInt();
        for(int i=s;i<=e;i++){
            if(palindrome(i)){
                System.out.print(i+" ");
            }
        }
        sn.close();

        
    }
    
}
