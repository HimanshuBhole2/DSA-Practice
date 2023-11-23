public class linked_list_palin {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    public static void addFirst(int data){
        Node temp = new Node(data);
        size++;
        if(head ==null){
            head = temp;
            tail = temp;
            return;
        }
        temp.next = head;
        head = temp;
        
    }

    public static void addLast(int data){
        Node temp = new Node(data);
        size++;
        if(head==null){
            head = temp;
            tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
        
    }

    public static void removeFirst(){
        head = head.next;
        size--;
    }
    public static void removeLast(){
        Node temp = head;
        size--;
        while(temp.next!=tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }
// -----------------------------------------------------------------------------------------------

    public static void reverseList(){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node preNode =null;
        Node currNode =tail =head;
        Node next;
        while(currNode!=null){
            next = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = next;
        }
        head = preNode;
    }

    public static void print(){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data + " => ");
            temp =  temp.next;
        }
         System.out.print(temp.data);
        System.out.println(" Size : " +size);
    }

    public static Node reverse_List(Node list){
        Node currNode = list;
        Node preNode = null;
        Node next ;
        while(currNode !=null){
            next = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = next;
        }
        return preNode;

    }

    public static boolean isPalindrome() {
        Node temp = head;
        
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(size%2==0){
            fast = reverse_List(slow);
        }else{
            fast = reverse_List(slow.next);
        }
        for(int i =1;i<=size/2;i++){
            if(temp.data != fast.data){
                System.out.println("List Is Not Palindrome");
                return false;
            }
            temp = temp.next;
            fast = fast.next;
        }
        System.out.println("List is Palindrome");
        return true;
    }
    

    public static void main(String[] args) {
        
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(2);
        addLast(1);
        isPalindrome();
        print();
    }
}
