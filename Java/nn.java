
import java.util.Scanner;

public class nn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int[] arr = new int[s.length];
       int sum=0;
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
            sum=sum+arr[i];
        }

        

        System.out.println(sum);
        sc.close();

    }

}
