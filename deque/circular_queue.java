public class circular_queue {

    public static class Queue{
        public static int rear ;
        public static int front;
        public static int size ;
        public static int arr[];
        Queue(int n){
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }

    public static  boolean isEmpty(){
        return rear ==-1 && front==-1;
    }

    public static boolean isfull(){

        boolean tt = ((rear+1) % size) == front;
        return (tt);
    }

    public static void add(int n){
        if(isfull()){
            System.out.println("Queue is already full");
            return ;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
            arr[front] = n;
            return;
        }
        rear = (rear+1)%size;
        arr[rear] = n;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("It is Empty");
            return -1;
        }
        if(rear == front){
            int nu = arr[front];
            rear = -1;
            front = -1;
            return nu;
        }
        else{
            int nu = arr[front];
            front = (front+1)%size;
            return nu;
        }
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("This is Empty");
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
       Queue q = new Queue(4);
       q.add(3);
       q.add(7);
       q.add(4);
       q.add(5);
       q.remove();
       q.add(6);
       print(q.arr); 
       System.out.println(q.arr[q.rear]);
    }


}
