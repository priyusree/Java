import java.util.*;
public class tcs3 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String str=sn.nextLine();
       str= str.replaceAll("[\\[\\]]", "");  // remove [ and ]
       str= str.replaceAll(",", " ");        // replace commas with space
       str= str.trim();
        String[]tokens=str.split("\\s+");
        int n=tokens.length;
        int size=Integer.parseInt(tokens[n-1]);
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(tokens[i]);
        }
       
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
       
        sn.close();



    }
    
}
