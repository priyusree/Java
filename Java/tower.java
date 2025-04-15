import java.util.Scanner;

public class tower {
    
    public static void hanoi(int n, char fromRod, char auxRod, char toRod) {
        
        if(n==1){
            System.out.println( fromRod + "->" + toRod);
            return;
        }
        hanoi(n - 1, fromRod, toRod, auxRod);
        System.out.println(fromRod+"->"+toRod);
        hanoi(n - 1, auxRod, fromRod, toRod);

    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

       
        hanoi(n, 'A', 'B', 'C');

        
        scanner.close();
    }
}
