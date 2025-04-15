public class series {
    public static void main(String[] args) {
        int num=10;
        double sum=0.0;
        for(int i=1;i<=num;i++){
            sum+=1.0/i;
        }
        // int n=10;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
            System.out.printf("%.5f",sum);
        }
    }

