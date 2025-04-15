import java.util.*;
public class task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
            int n=sc.nextInt();
        System.out.println("Enter numbers:");

            int arr[]=new int[n];
            for(int i=0;i< n;i++){
                  arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]!=0){
                    arr[count++]=arr[i];
                }
            }
            for(int i=count;i<n;i++){
                if(arr[i]==0){
                    arr[count++]=arr[i];
                }
                
            }
            for(int num:arr){
                System.out.print(num+" ");
            }
    
   sc.close();
    }
}
