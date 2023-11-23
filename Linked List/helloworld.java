// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class helloworld {
    
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
    public static void insertNode(int data){
        Node temp = new Node(data);
        Node temp2 = head;
        if(head == null){
            head= tail =temp;
            return;
        }
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = temp;
    }


    public static int size(){
        int size =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;

    }
    
    public static void print(Node list){
        Node temp =list;
        while(temp != null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("Size : "+size());
    }
    
    public static Node findMid(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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

    public static boolean checkPalindrome(Node left,Node right){
        while(right!= null){
            if(left.data != right.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    
    public static void main(String[] args) {
        insertNode(1);
        insertNode(2);
        insertNode(3);
        insertNode(3);
        insertNode(2);
        insertNode(1);
        print(head);
        System.out.println();
        System.out.println(findMid().data);
        Node head2 = reverse_List(findMid());
        System.out.println(checkPalindrome(head, head2));
        print(head);
        print(head2);
        
        
        
    }
}
