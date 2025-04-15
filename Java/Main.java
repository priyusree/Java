import java.util.*;
class Main {
    public static int countsundays(String day,int n){
        Map<String,Integer>map=new HashMap<>();
            map.put("mon",0);
           // map.put("mon",1);
            map.put("tue",1);
            map.put("wed",2);
            map.put("thu",3);
            map.put("fri",4);
            map.put("sat",5);
            map.put("sun",6);
                int count=0;
        int start=map.get(day);
        for(int  i=1;i<=n;i++){
            if((start+i)%7==map.get("sun")){
                count++;
            }
            
            
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String str=sn.nextLine();
        int n=sn.nextInt();
        System.out.print(countsundays(str,n));
        
    
    sn.close();
    }
}
