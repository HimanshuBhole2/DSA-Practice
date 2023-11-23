import java.lang.reflect.Array;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class stock_span_problem {
    
    public static void stock_span(int stock[],int span[]){
        Stack <Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i =1;i<stock.length;i++){

            int currprice = stock[i];
            while(!s.isEmpty() && stock[s.peek()]<currprice ){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]= i+1; 
            }
            else{
                int ind = i - s.peek();
                span[i] = ind;
            }
            s.push(i);

        }

    }

    public static void next_greter(int num[],int arr[]){
        Stack<Integer>s = new Stack<>();
        //6,8,0,1,3
        for(int i = num.length-1;i>=0;i--){

            while(!s.isEmpty() && s.peek()<num[i]){
                s.pop();
            }

            if(s.isEmpty()){
                arr[i] = -1;
            }
            else{
                arr[i] = s.peek();
            }
            s.push(num[i]);
        }
    }


    public static void print(int arr[]){
        int size = arr.length;
        for(int i =0 ;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {

        int[] num = {6,8,0,1,3};
        int[] arr = new int[num.length];
        next_greter(num,arr);
        print(arr);
    }
}
