class q12_duplicate {
    public static void main(String[] args) {
    //   ArrayList<Integer> arr_list = new ArrayList<>();
      int[] arr = {1,2,3,6,3,6,1};
    //   for(int i =0;i<arr.length;i++){
    //       arr_du[i] = arr[i];
    //   }
      int n = arr.length;
      for(int i = 0;i< arr.length;i++){
          arr[arr[i]%n] = arr[arr[i]%n] + n;
      }
      for(int i =0; i<n;i++){
          if (arr[i] >= 2*n)
            System.out.print(i + " ");
      }
    }
}