import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2;  i <= (n/2); i++) { 
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = sn.nextInt();
        
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("The sum of prime numbers between 2 to " + n + " is " + sum);

        sn.close(); // Closing Scanner
    }
}
