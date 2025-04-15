public class oct2 {
    public static void main(String[] args) {
        int dec=12345;
        String oct="";
        while(dec>0){
            int temp=dec%8;
            oct=temp+oct;
            dec/=8;
        }
        System.out.print(oct);
    }
    
}
