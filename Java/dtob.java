public class dtob {
    public static void main(String[] args) {
        int dec=13;
        String bin="";
        while(dec>0){
            int temp=dec%2;

            bin=temp+bin;
            dec/=2;
        }
        int num=Integer.parseInt(bin);
        System.out.print(num);
    }
    
}
