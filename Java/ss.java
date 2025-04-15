import java.util.*;
public class ss {
    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static int findnthnumber(int k){
        int count=0,num=1;
        while(count<k){
            num++;
            if(isprime(num)){
                count++;
            }
        }
        return num;

    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int p1=sn.nextInt();
        int p2=sn.nextInt();
        int x=findnthnumber(p1);
        int y=findnthnumber(p2);
        int result=(x*y)-1;
        System.out.println(result);
        sn.close();
        

        
    }
    
}
