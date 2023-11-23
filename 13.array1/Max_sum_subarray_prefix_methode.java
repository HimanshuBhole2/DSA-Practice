public class Max_sum_subarray_prefix_methode {
    public static void max_sum(int arr[]){
        int end = arr.length-1;int start = 0;

        int duplicate[];
        int sum = 0;
        for(int i= start;i<arr.length;i++){
            sum += arr[i];
            duplicate[i]=sum;
        }
        

    }


    public static void main(String[] args){
        int arr[]={5,1,-2,6,-4,7,3};

    }
}
