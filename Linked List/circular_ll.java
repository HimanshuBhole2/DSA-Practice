public class circular_ll {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        };
    }


    public static Node head;
    public static Node tail;

    public static void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void print(Node te){
        Node temp = te;
        while(temp.next!= te){
            System.out.print(temp.data+" => ");
            temp = temp.next;
        }
        System.out.println(temp.data);

    }

    public static void delete(int key){
        Node temp = head.next;
        if(head.data == key){
            head = head.next;
            tail.next = head;
            return;
        }

        while(temp!= head){
            if(temp.next.data == key){
                temp.next = temp.next.next;
                return;
            }
            else
            {temp = temp.next;}
        }
        
       System.out.println("key : "+key + " is not found");
    }

    public static void reverse(Node head1){
        Node curr = head1;
        Node pre = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        pre.next = head1;
    }

    public static void main(String[] args) {
        addlast(1);
        addlast(2);
        addlast(3);
        addlast(4);
        addlast(5);
        tail.next = head;



        print(head);


        delete(1);
        print(head);
        
    }
}
