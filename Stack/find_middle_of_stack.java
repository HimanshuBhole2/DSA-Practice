public class find_middle_of_stack {
    public static class Node{
        int data;
        Node next;
        Node pre;
        Node (int data){
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }

    public static Node head;
    public static Node mid;
    public static int size=0;
    public static void add(int data){

        Node newNode = new Node(data);
        if(size==0){
            head = newNode;
            size++;
            mid = newNode;
            return;
        }
        newNode.next = head;
        head.pre = newNode;
        head = newNode;
        if(size%2!=0){
            mid = mid.pre;
        }
        
        size++;
    }

    public static Node pop(){
        if(head == null){
            System.out.println("List is emptyu");
            return null;
        }
        Node temp = head;
        head = head.next;
        head.pre = null;
        size--;
        if(size%2!=0){
            mid = mid.next;
        }
        return temp;
    }

    public static void print(){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        // add(2);
        // add(3);
        // add(4);
        // add(5);
        // add(6);
        // add(7);
        pop();
        print();
        System.out.println(mid.data);
    }
}
