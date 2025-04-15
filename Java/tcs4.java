public class tcs4 {
    public static void main(String[] args) {
        int[]arr={1,2,4,7,7,5};
        int min=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
          
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
            if(arr[i]<min){
                min2=min;
                min=arr[i];
                
            }
            if(arr[i]<min2 && arr[i]!=min){
                min2=arr[i];
            }
        }
        System.out.println(max2);
        System.out.println(min2);

       
    }
    
}
