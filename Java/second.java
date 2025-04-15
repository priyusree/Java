import java.util.*;;
public class second {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        int max1=Integer.MAX_VALUE,max2=Integer.MAX_VALUE;
        for(int  num:arr){
            if(num<max1){
                max2=max1;
                max1=num;
            }
            else if(num<max2 && num!=max1){
                max2=num;
            }
        }
        if(max2 ==Integer.MAX_VALUE){
            System.out.println("No second smallest element");
        }
        else{
        System.out.print("Secong smallest element:"+max2);
        }
        sn.close();
    }

    
}
