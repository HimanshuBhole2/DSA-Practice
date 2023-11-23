public class queue_linked_list {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.next = null;
            this.data = data;
        }
    }

    public static Node front;
    public static Node rear;

    public static boolean isEmpty(){
        return rear == null && front == null;
    }

    public static int peek(){
        return front.data;
    }

    public static void add(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            rear = newNode;
            front = rear;
            return;
        }
        
        rear.next = newNode;
        rear = newNode;
    }

    public static int remove(){
        if(isEmpty()){return -1;}
        if(front==rear){
            int data = front.data;
            front = null;
            rear = null;
            return data;
        }
        int data = front.data;
        front = front.next;
        return data;

    }

    public static void print(){
       Node temp = front;
        while(temp.next!=null){
        System.out.print(temp.data + " => ");
        temp = temp.next;
    }System.out.println(temp.data);
    }
    public static void main(String[] args) {
        System.out.println(remove());
        // System.out.println(peek());
    }
}
