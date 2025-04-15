import java.util.Scanner;

public class sum {
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
    public static void main(String []args){
        Scanner sn=new Scanner(System.in);
        int num=sn.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){

            if(isprime(i)){
                sum+=i;
            }

        }
        System.out.println("Sum of prime numbers ine the given range is "+sum);
        sn.close();
        
    }
    
}
