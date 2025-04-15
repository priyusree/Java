import java.util.*;
//port java.lang.*;
public class arm {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int original=n;
        int count=0,temp=n;
        while(temp!=0){
         temp/=10;
            count++;
        }
        temp=n;
        int sum=0;
        while(temp!=0){
            int rev=temp%10;
            sum+=Math.pow(rev,count);
            temp/=10;

        }
        if(original==sum){
            System.out.println("Given number is armstrong number");
        }
        else{
            System.out.println("Given number is not Strong number");

        }
        sn.close();
    }
}
