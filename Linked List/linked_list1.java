class linked_list1{

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

    public static void insertBetn(int data,int ind){
        int trr = 0;
        if(ind ==0){
            addFirst(data);
            return;
        }
        size++;
        Node temp = head;
        for(int i = 0;i<ind-1;i++){
            temp = temp.next;
        }

        // if(temp.next == null){
        //     addLast(data);
        // }
        Node newN = new Node(data);
        newN.next = temp.next;
        temp.next = newN;
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
    public static void rmNthEnd(int ind){
        Node temp = head;
        int sz = 0;
        while(temp !=null){
            temp = temp.next;
            sz++;
        }
        if(ind==sz){
            removeFirst();
            return;
        }
        temp = head;
        int Nth = sz- ind;
        for(int i = 1;i<Nth;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

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
        int si = 0;// For tracking the size
        while(temp.next!=null){
            System.out.print(temp.data + " => ");
            temp =  temp.next;
            si++;
        }
         System.out.print(temp.data);
         si++;
        System.out.println(" Size : " +si);
    }



    public static int search(int key,Node temp,int ind){
        if(temp.data==key){
            System.out.println("Found at Index : "+ ind);
            return temp.data;

        }
        else if(temp.next == null){
            return -1;
        }
        ind++;

       return search(key,temp.next,ind);

    }

    public static int search_recur(int key,int ind,Node temp){
        if(temp==null){
            return -1;
        }
        if(temp.data == key){
            System.out.println("Key IS Found at index " + ind);
            return ind;
        }
        return search_recur(key,++ind,temp.next);
    }

    public static void rmNth(int key){
        Node temp = head;
        if(temp.data == key){
            head = temp.next;
            return;
        }
        while(temp!=null){
            if(temp.next.data == key){
                if(temp.next.next == null){
                    temp.next = null;
                    return;
                }
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Key is Not Found");
    }

    public static void main(String[] args) {
        
        addFirst(0);
        addLast(4);
        insertBetn(1, 1);
        insertBetn(2,2);
        insertBetn(3,3);
        insertBetn(23, 0);
        print();
      rmNth(4);
        print();
        


    }



}