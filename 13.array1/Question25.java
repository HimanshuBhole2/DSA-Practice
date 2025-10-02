class Question25 {
    
// Print array
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void getAllCombinations(int arr[], int k){

        int n = arr.length;
        for(int i = 0;i<=n-k;i++){

            int list[] = new int[k];
            
            // First fill the list with k-1 element 
            // use temp as flag to store the last index of the list 
            int temp = 0;
            for (int s = 0;s<k-1;s++){
                list[s] = arr[i+s];
                temp = i+s;
            }
            temp++;
            
            // update the last element only in the list 
            for(int j = temp; j<n;j++){
                list[list.length-1] = arr[j];
                printArray(list);
            }

        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 3;
        getAllCombinations(arr, k);
    }
}