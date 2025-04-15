import java.util.*;
public class str2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String str=sn.nextLine().toLowerCase();
        char[]ch=str.toCharArray();
          Set<Character>vowels=new HashSet<>();
          Set<Character>consonants=new HashSet<>();
        // int vc=0,cc=0;
        // for(int i=0;i<str.length();i++){
        //     if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'){
        //         vc++;
        //     }
        //     else if(ch[i]>='a' && ch[i]<='z'){
        //         cc++;
        //     }
        // }
        for(int i=0;i<str.length();i++){
            if(ch[i]>='a' && ch[i]<='z'){
                if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'){
                    vowels.add(ch[i]);
                }
                else{
                    consonants.add(ch[i]);
                }

            }
        }
            // System.out.println("count of vowels "+vc);
            // System.out.println("count of consonants "+cc);
            System.out.println("count of vowels "+vowels.size());
            System.out.println("count of vowels "+consonants.size());



        
        sn.close();
    }
    
}
