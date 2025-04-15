import java.util.*;
public class max{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int []arr=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        sn.close();
    }
}