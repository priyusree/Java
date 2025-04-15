import java.util.Scanner;

public class pp{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int m=sn.nextInt();
        int n=sn.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        sn.close();
    }
}