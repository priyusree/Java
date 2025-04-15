import java.util.*;
public class tcs {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String line=sn.nextLine();
        List<Integer>arr=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:line.toCharArray()){
            if(Character.isDigit(ch)){
                sb.append(ch);
            }
            else if(sb.length()>0){
                arr.add(Integer.parseInt(sb.toString()));
                sb.setLength(0);
            }
        }
        if(sb.length()>0){
            arr.add(Integer.parseInt(sb.toString()));
            sb.setLength(0);
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        sn.close();
        
    }
    
}
