import java.util.*;


public class queue_using_stack {
    

    public static class Queue{
        public static Stack<Integer>st1 = new Stack<>();
        public static Stack<Integer>st2= new Stack<>();

        public static boolean isEmpty() {
            return st1.isEmpty();
        }

        public static Stack<Integer> insert(Stack<Integer> st,int data){
            if(st.isEmpty()){
                st.push(data);
                return st ;
            }
            int val = st.pop();
            st = insert(st, data);
            st.push(val);
            return st;
        }

        public static void add(int data){
            st1.push(data);
        }



        public static int remove(){
            if(isEmpty()){return -1;}
            return st1.remove(0);
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return st1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(3);
        q.add(8);
        q.add(2);
        System.out.println(q.st1);
        q.remove();
        System.out.println(q.st1);
        System.out.println(q.peek());
    }
}
