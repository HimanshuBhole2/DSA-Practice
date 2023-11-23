

public class Largest_in_array {
    public static void reverse(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        int arr[] ={4,6,2,7,8,3,6,3};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
