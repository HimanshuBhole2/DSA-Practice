public class dubely_pair_sum {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return ;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static void print(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println(temp.data);

    }

    //find the sum pair of given key
    public static void getPariSum(int key){
        Node left = head;
        Node right = tail;
        while(left.data<=right.data && left!=right){
            int sum = left.data+right.data;
            if(sum == key){
                System.out.println("Pair is : (" + left.data +", " + right.data+")"); 
            }else if(sum<key){
                left= left.next;
            }
            else{
                right = right.prev;
            }

            while(left.data == left.next.data){
                    left= left.next;
                }
                left = left.next;
                while(right.data == right.prev.data){
                    right = right.prev;
                }
                right = right.prev;
        }
    }

    //rotate the dubly Linked list;

    // public static void rotate(){
    //     Node temp = head;
        
    //     head = head.next;
    //     head.prev = null;
    //     temp.next = null;
    //     temp.prev = tail;
    //     tail.next = temp;
    //     tail = temp;
    // }

    // public static void rotate_list(int k){
    //     for(int i = 0;i<k;i++){
    //         rotate();
    //     }
    // }

        // Ṛotation efficient Way for clkwise rotation; 

        public static void rotate(int k ){
            Node temp = head;
            if(k==0){
                return;
            }
            int count=1;
            while(count<k && temp!=null){
                temp = temp.next;
                count++;
            }

            Node t = head;
            while(t.next != null){
                t = t.next;
            }
            t.next = head;
            head.prev = t;
            head = temp.next;
            head.prev = null;
            temp.next = null;

        }

    public static Node reverse(Node temp){
        if(temp.next== null){
            return temp;
        }
        Node prev= null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        // prev.prev = temp;
        return prev;

    }

    public static void rotate_in_group(int k){
        
        if(k<=1){
            return ;
        }
        Node temp = head;
        int count = 1;
        while(count<k && temp!= null){
            temp = temp.next;
            count++;
        }
        if(temp== null){
            return;
        }
        Node remaining = temp.next;
        temp.next = null;

        head = reverse(head);
        Node temp2 = head;// Initilize Pointer for the traversing.
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = remaining;
        remaining.prev = temp2;

    }

    public static void main(String[] args) {
       addlast(1);
       addlast(2);
       addlast(3);
       addlast(4);
       addlast(5);
       addlast(6);
       addlast(7);
       print();
        rotate_in_group(5);
        print();

    }
}
