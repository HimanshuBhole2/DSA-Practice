public class Sub_arrays_print_all {
    public static void subarray(int arr[]){

        int ts = 0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                for(int c=i;c<=j;c++){
                    System.out.print(arr[c] + " ");
                    
                }
                ts++;
                System.out.println();
            }System.out.println();


        }
        System.out.println("Total Sub array = "+ ts);
    }


    public static void main(String[] args){
            int arr[]= {2,5,3,6,7};
            subarray(arr);
    }
}
