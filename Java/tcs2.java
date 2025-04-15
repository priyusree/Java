import java.util.*;
public class tcs2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String str=sn.nextLine();
       str= str.replaceAll("[\\[\\]]", "");  // remove [ and ]
       str= str.replaceAll(",", " ");        // replace commas with space
       str= str.trim();
        String[]tokens=str.split("\\s+");
        int size=Integer.parseInt(tokens[0]);
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(tokens[i+1]);
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.print(sum+" ");
        sn.close();



    }
    
}
