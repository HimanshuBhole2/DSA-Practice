public class Binary_Search {
    public static void binary_search(int array[],int key){
        int left = 0;
        int right = array.length-1;
        int mid = (left + right)/2;
        while(left<=right){
            mid = (left + right)/2;
            if(array[mid] == key){
                System.out.println("Found Key : " + key + " at position : " + mid);
                return ;
            }

            if(array[mid]<key){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println("Key : " + key + " is Not in the array");
        return ;
    }

    public static void main(String[] args){
        int arr1[] = {2,5,6,7,23,34,54,76,77,87,97,100,532,654,755,7543};
        binary_search(arr1, 877);
    }
}
