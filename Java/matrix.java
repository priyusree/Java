import java.util.*;
public class matrix {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2;  i <= (n/2); i++) { 
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String str=sn.nextLine();
        String[]tokens=str.split("\\s+");
        int len=tokens.length;
        int rows=Integer.parseInt(tokens[0]);
        int cols=Integer.parseInt((tokens[1]));
        int n=rows*cols;
        if(len!=2+n){
            System.out.println("Invalid Input");
        }
        
        int[][]matrix=new int[rows][cols];
        int index=2;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int val=Integer.parseInt(tokens[index++]);
                if(val<0){
                    System.out.println("Invalid Input");
                }
                else{
                matrix[i][j]=val;
                }
            
            }
        }
        for(int i=0;i<rows)

        sn.close();
    }
    
}
