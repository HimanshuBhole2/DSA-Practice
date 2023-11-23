
public class largest_in_arrry {
    public static int largest(int array[]){
        int m = -103434534;
        for(int i = 0; i < array.length;i++){
            if(array[i]> m){
                m =array[i];
            }
        }
        return m;
    }


    public static void main(String[] args){
        int arr1[] = {6,3,7,34,75,75,23,54,234,232,53,233,2,3,532,984,2,53};
        System.out.println(largest(arr1));
    }
}
