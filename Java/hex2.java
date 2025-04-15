public class hex2 {
    public static void main(String[] args) {
        String hex = "3E8";
        char[]ch=hex.toCharArray();
        int dec=0;
        for(int i=0;i<ch.length;i++){
            int value;
            if(ch[i]>='0' && ch[i]<='9'){
                value=ch[i]-'0';
            }
            else {
                value=ch[i]-'A'+10;
            }
            dec+=value*Math.pow(16,ch.length-i-1);
            

        }
        System.out.print(dec);
        
    }
    
}
