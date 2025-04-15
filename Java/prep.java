import java.util.*;
public class prep{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int []arr=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
            if(arr[i]==0){
                arr[index]=arr[i];
                index++;
            }
            if(arr[i]==1){
                arr[index]=arr[i];
                index++;
            }
            if(arr[i]==2){
                arr[index]=arr[i];
                index++;
            }
        }
        for(int num:arr){
            System.out.println(num+" ");
        }

        sn.close();
    }
}