import java.util.*;
public class aaa {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sn.nextLine();
        Map<Character,Integer>map=new LinkedHashMap<>();
       
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        char maxchar='\0';
        int maxval=0;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()>maxval){
                maxval=entry.getValue();
                maxchar=entry.getKey();
            }
           
        }
        char fnrc='\0';
        for(char ch:str.toCharArray()){
            if(map.get(ch)==1){
                fnrc=ch;
                break;
            }
        }
        
            char frc='\0';
            for(char ch:str.toCharArray()){
                if(map.get(ch)>1){
                    frc=ch;
                    break;
                }
            }
        if( fnrc=='\0'){
            System.out.println("Most Repeated Character "+maxchar+" (appears "+maxval+" times)" );
            System.out.println("None "+frc);
            }
            else{
                System.out.println("Most Repeated Character "+maxchar+" (appears "+maxval+" times" );
                System.out.println("First Non-Repeating Character: "+fnrc);
            }


        sn.close();
    }
    
}
