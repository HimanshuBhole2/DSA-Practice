public class linked_list_limitReverse {
    
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode head;
    public static ListNode tail;
    
    public static void addLast(int data){
        ListNode temp = new ListNode(data);
        ListNode temp2 = head;
        if(head == null){
            head= tail =temp;
            return;
        }
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = temp;
    }



    public static void print(){
        ListNode temp = head;
        while(temp.next!= null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        int n =0;
        ListNode temp = head;
        while(temp!=null ){
            temp = temp.next;
            n++;
        }
        temp = head;
        for(int i = 1; i<left;i++){
            temp = temp.next;
        }
        ListNode temp2 = head;
        for(int i = 1;i<=n-right;i++){
            temp2 = temp2.next;
        }
        ListNode newNode = temp.next;
        ListNode preNode = temp.next;
        ListNode currNode = preNode.next;
        preNode.next = null;
        ListNode next;
        while(currNode != temp2){
            next = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = next;
        }
        temp.next = preNode;
        newNode.next = temp2;

        return head;

    }





    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        print();
        System.out.println();
       reverseBetween(head,2,1);
       print();
    //    print();
    }








}
