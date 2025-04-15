import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        // int mid = (low + high) / 2;
        // int pivot = arr[mid];

        // int i = low;
        // int j = high;

        // while (i <= j) {
        //     while (i <= high && arr[i] < pivot) {
        //         i++;
        //     }
        //     while (j >= low && arr[j] > pivot) {
        //         j--;
        //     }
        //     if (i <= j) {
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //         i++;
        //         j--;
        //     }
        // }
        // return i;
        int mid=(low+high)/2;
        int pivot=arr[mid];
        int i=low;
        int j=high;
        while(i<=j){
            while(i<=high && arr[i]<pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return i;
    
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotPos = partition(arr, low, high);
            quicksort(arr, low, pivotPos - 1);
            quicksort(arr, pivotPos, high);
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sn.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sn.nextInt();
        }
        
        quicksort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
        sn.close();
    }
}
