public class linkedlist_zigzag {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static Node getMid(Node temp){
        Node slow = temp;
        Node fast = temp.next;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //  ADDD The Node List
    public static void addlast(int data){
        Node temp = new Node(data);
        if(head== null){
            head = tail = temp;
            return ;
        }
        tail.next = temp;
        tail = temp;

    }

    public static void print(Node sl){
        Node temp = sl;
        while(temp.next != null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    // Reverse the Linked list .

    public static Node reverse(Node temp ){
        Node pre = null;
        Node curr = temp;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
    // Zig Zag Of Linked List
    
    public static Node zigzag(Node Left,Node Right){
        Node he = Left;
        Node n_left;
        Node n_right;
        while(Left!=null && Right!= null){
            n_left = Left.next;
            Left.next = Right;
            n_right = Right.next;
            Right.next = n_left;
            Left = n_left;
            Right = n_right;
        }
        return he;


    }


    public static void main(String[] args) {
        addlast(0);
        addlast(2);
        addlast(3);
        addlast(4);
        addlast(45);
        addlast(34);
        addlast(23);
        Node newndo= getMid(head);
        Node Right = reverse(newndo.next);
        newndo.next = null;
        Node Left = head; 
        print(Left);
        print(Right);
        // declearation of out zigzag
        Node hel = zigzag(Left, Right);
        print(hel);


    }
}
