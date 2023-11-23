import java.util.*;

public class intro_dque{

    public static class Queque{
       public static int arr[];
       public static int front = 0;
       public static int rear;
       public static int size;

        Queque(int n){
            arr= new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear== size-1){
                System.out.println("Deque is fulled");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Deque is already fulled");
                return -1;
            }
            int front = arr[0];
            for(int i =0;i<=rear-1;i++){
                arr[i] = arr[i+1];
            }
            arr[rear] = 0;
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Deque is already fulled");
                return -1;
            }
            return arr[front];
        }
    }


    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");}
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Queque dq = new Queque(8);
        // dq.add(1);
        // dq.add(2);
        // dq.add(3);
        // dq.add(4);
        // dq.add(5);
        // dq.add(6);
        // dq.add(7);
        // dq.add(8);
        // System.out.println(dq.peek());
        print(dq.arr);
        dq.remove();
        System.out.println(dq.isEmpty());
        print(dq.arr);
    }
}