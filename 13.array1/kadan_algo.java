public class kadan_algo {
    
    public static void max_sum(int arr[]){
        int curr_sum = 0;
        int max = 0;
        
        for(int i=0;i<arr.length;i++){
            curr_sum += arr[i];
            if(curr_sum<0){curr_sum =0;};
            if(curr_sum>max){
                max = curr_sum;
            }
        }
        System.out.print("Maximum sum : "+max);

    }

    public static void main(String [] args){
        int arr[]= {-2,-3,4,-1,-2,1,5,-3};
        max_sum(arr);

    }



}
