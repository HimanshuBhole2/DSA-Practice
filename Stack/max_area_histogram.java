import java.util.Stack;

public class max_area_histogram {
    
    public static void max_area(int rect[]){
        Stack<Integer> s_left = new Stack<>();
        int size = rect.length;
        /// creating the left maximum array;
        int left[] = new int[rect.length];
        left[size-1] = size;
        s_left.push(size-1);
        for(int i = size-2;i>=0;i--){
            int curr = rect[i];
            while(!s_left.isEmpty() && rect[s_left.peek()]>curr){
                s_left.pop();
            }
            if(s_left.isEmpty()){
                left[i] = size;
            }else{
                left[i] = s_left.peek();
            }
            s_left.push(i);
        }

        // right array
        int right[] = new int[rect.length];
        Stack<Integer> s_right = new Stack<>();
        right[0] = -1;
        s_right.push(0);
        for(int i=1;i<size;i++){
            int curr = rect[i];
            while((!s_right.isEmpty()) && rect[s_right.peek()]>curr){
                s_right.pop();
            }
            if(s_right.isEmpty()){
                right[i] = -1;
            }
            else{
                right[i] = s_right.peek();
            }
            s_right.push(i);

        }
        print(left);print(right);
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i<size){
            int sum = Math.abs(rect[i]*(left[i]-right[i]-1));
            if(max<sum){
                max = sum;
            }
            i++;
        }
        System.out.println(max);


    }

    public static void print(int re[]){
        for(int i = 0;i<re.length;i++){
            System.out.print(re[i]+ " ");
        }
        System.out.println("");
    }


    public static void main(String[] args) {
       int rect[] = {2,1,5,6,2,3};
       max_area(rect);
    }
}
