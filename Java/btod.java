public class btod {
    public static void main(String[] args) {
       int bin=1101;
       int decimal=0,pow=0;
       while(bin!=0){
        int temp=bin%10;
        decimal+=temp*Math.pow(2,pow);
        bin/=10;
        pow++;
       }
       System.out.print(decimal);

    }
}
