public class BrouteForce {
    public static void subarray(int arr[]){
        int current_sum = 0;
        int max=Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0]= arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]= prefix[i-1]+arr[i];
        }


        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                current_sum = start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(max<current_sum){
                    max= current_sum;
                }
            }
        }
        System.out.println("Maxumum sum of Sub array = "+ max);
    }


    public static void main(String[] args){
            int arr[]= {1,-2,6,-1,3};
            subarray(arr);
    }
}
