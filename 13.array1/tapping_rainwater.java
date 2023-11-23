public class tapping_rainwater {
    
    public static int rainwater(int arr[]){
        
        int left_max[] = new int[arr.length];
        left_max[0]= arr[0];
        for(int i=1;i<arr.length;i++){    
            left_max[i] = Math.max(left_max[i-1],arr[i]);        }
        
//
        int right_max[] = new int[arr.length];
        right_max[arr.length-1] = arr[arr.length-1];
        for(int i =arr.length-2; i>=0;i--){
           right_max[i] = Math.max(arr[i], right_max[i+1]);
        }
        int waterLavel=0;
        int tappedWater=0;

        for(int i=0;i<arr.length;i++){
            waterLavel = Math.min(right_max[i],left_max[i]);
            tappedWater+= waterLavel-arr[i];
        }
        return tappedWater;

    }

    public static void main(String[] args){
        int arr[] = {4,2,0,6,3,2,5};

        System.out.println(rainwater(arr));
    }
}
