public class resursion_search_linked {

public class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;

    }
}
public static Node head;
public static void print(){
    Node temp = head;
    while(temp.next!=null){
        System.out.print( temp.data+" => ");
       temp =  temp.next;
    }
    System.out.print(temp.data);
    System.out.println();
}

public static void main(String[] args) {
    head = Node(89);
    
}

}
