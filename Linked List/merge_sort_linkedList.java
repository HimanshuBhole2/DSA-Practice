public class merge_sort_linkedList {
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

    
    public static void print(){
        Node temp = head;
        int size = 0;
        while(temp.next!=null){
            System.out.print(temp.data + " => ");
            temp =  temp.next;
            size++;
        }
         System.out.print(temp.data);
        System.out.println(" Size : " + ++size);
    }

    public static Node getMid(Node temp){
        Node slow = temp;
        Node fast = temp.next;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node left_head,Node right_head){

        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while(left_head != null && right_head!= null){
            if(left_head.data >= right_head.data){
                temp.next = right_head;
                temp = temp.next;
                right_head = right_head.next;
            }else{
                temp.next = left_head;
                temp = temp.next;
                left_head = left_head.next;
            }
        }
        while(left_head!= null){
            temp.next = left_head;
            temp = temp.next;
            left_head = left_head.next;
        }
        while(right_head!=null){
            temp.next = right_head;
            temp = temp.next;
            right_head = right_head.next;
        }
        return mergedll.next;


    }

    public static Node mergeSort(Node temp_head){
        if(temp_head==null || temp_head.next == null){
            return temp_head;
        }
        Node mid = getMid(temp_head);
        Node right_head = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(temp_head);
        Node newRight =  mergeSort(right_head);

        //merge
        return merge(newLeft,newRight);



    }

    // Shift Last Element to Front Side

    public static void shift(){
        if(head.next == null){
            return;
        }
        Node newNode = new Node(-1);
        newNode.next = head;
        head = newNode;
        Node temp = newNode.next;

        while(temp.next.next!= null){
            temp = temp.next;
        }
        newNode.data = temp.next.data;
        temp.next = null;
    }

    public static void main(String[] args) {
        
        addLast(1);
        
        print();
        // System.out.println(head.data);

        shift();
        print();
    }
}

