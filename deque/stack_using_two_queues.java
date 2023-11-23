import java.util.*;
public class stack_using_two_queues {
    
    public static class stack{
        public static  Queue<Integer> q1 = new LinkedList<>();
        public static Queue <Integer>q2 = new LinkedList<>();

        public static boolean isEmpty(){
            boolean stt=q1.isEmpty() &&  q1.isEmpty();
            return stt;
        }
        public static  void push(int data){
            if(isEmpty()){
                q1.add(data);
                return;
            }
            if(q1.isEmpty() ){
                q2.add(data);
            }else{
                q1.add(data);
            }

        }

        public static int pop(){
            int top = -1;
            if(isEmpty()){
                return -1;
            }
            if(q1.isEmpty()){
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            else{
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            return top;
        }

        public static int peek(){
            // if(isEmpty()){return -1;}
            int top = 0;
            if(q1.isEmpty()){
                 System.out.print("--H--");
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                };
            }else{
                System.out.print("--H--");
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }
            return top;
        }

    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(3);
        st.push(4);
        st.push(6);
        st.push(5);
        st.pop();
        System.out.println(st.q2);
        System.out.println(st.q1.isEmpty());
        System.out.println(st.q2.isEmpty());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());

    }
}
