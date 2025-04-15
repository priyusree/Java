public class rev {
    public static void main(String[] args) {
        int[]arr={23,54,36,65,72,69};
        int l=0,r=arr.length-1;
        while(l<r){
            arr[r]=arr[l]+arr[r];
            arr[l]=arr[r]-arr[l];
            arr[r]=arr[r]-arr[l];
            l++;
            r--;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
 
    }
    
}
