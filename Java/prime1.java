public class prime1 {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                 return false;
            }
        }
        return true;
    }
    public static int index(int n){
        int count=0,num=1;
        while(count<n){
            num++;
            if(isprime(num)){
                count++;
            }
        }
        return num;

    }
    public static int split(int num){
        while(num>9){
            int sum=0;
            while(num>0){
                int temp=num%10;
                sum+=temp;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
    public static void main(String[]args){
        int m=6;
        int n=8;
        int mm=index(m);
        int nn=index(n);
        int sp=split(mm);
        //int ps=split(nn);
        int mul=mm*sp;
        System.out.println(mul);




    }
    
}
