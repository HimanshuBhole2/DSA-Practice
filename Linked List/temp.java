public class temp {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public static void print(){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        //System.out.println(" " + tail.data);
    }

    
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
            return;
        }

    }


    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        return;
    }

    public static void addMiddle(int index,int data){
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;
        if(index==0){
            addFirst(data);
            return;
        }
        for(i =0;i<index-1;i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return;
        
    }
    //     TRACK SIZE

    public static int sizeLinked(){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }


    //remove first & LAST

    public static void removeFirst(){
        head = head.next;
        return;
    }
    
    public static void removeLast(){
       Node temp = head;
       while(temp.next != tail){
        temp = temp.next;
       }
       tail = temp;
       tail.next = null;
        return;
    }


    //Search Element

    public static void searchEle(int key){
        Node temp = head;
        int index = 0;
        while(temp!=null){
            if(temp.data == key){
                System.out.println("KEY FOund At : "+ index);
                return;
            }
            index++;
            temp = temp.next;
        }
        System.out.println("Key is Not in Linked list");
    }
    public static void main(String[] args){
        
        
        addLast(90);
        addFirst(43);
        addFirst(54);
        addFirst(76);
        addFirst(57);
        addMiddle(0,543);
        print();
        System.out.println();
        searchEle(71);

    }
}
