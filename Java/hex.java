public class hex {
    public static void main(String[] args) {
        int dec=1000;
        String hexa="";
        char[]hexs={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(dec>0){
            int temp=dec%16;
           hexa=hexs[temp]+hexa;
            dec/=16;

        }
        System.out.println(hexa);
    }
    
}
