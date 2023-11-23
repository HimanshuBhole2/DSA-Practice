public class find_triplet_sum_pair {
    
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
        Node left = head.next;
        Node right = tail;
        Node ptr = head;
        while(right!=left){
            left = ptr.next;
            right = tail;
            while(left.data<=right.data && left != right){
                int sum = left.data + right.data + ptr.data;
                if(sum==key){
                    System.out.println("Pair is : ("+ ptr.data+ ", " + left.data +", " + right.data+")");
                    left = left.next;
                    right = right.prev;
                    continue; 
                }else if(sum<key){
                    left = left.next;
                }
                else{
                    right= right.prev;
                }
            }

            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
       addlast(0);
       addlast(1);
       addlast(2);
       addlast(2);
       addlast(2);
       addlast(5);
       addlast(6);
       addlast(7);
       print(); 
        getPariSum(6);

    }

}
